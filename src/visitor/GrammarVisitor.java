package visitor;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import tree.*;
import tree.cycle.*;

import java.util.ArrayList;
import java.util.List;

public class GrammarVisitor extends GrammarBaseVisitor<Program> {

    @Override
    public Program visitProgram(GrammarParser.ProgramContext ctx) {
        List<Body> mainBody = getMainBody(ctx.main());

        List<Declaration> declarations = new ArrayList<>();
        List<Function> functions = new ArrayList<>();
        dataTypeControl(mainBody, declarations, functions);

        return new Program(mainBody);
    }

    private List<Body> getMainBody(List<GrammarParser.MainContext> mainCtx) {
        List<Body> mainBody = new ArrayList<>();
        for (GrammarParser.MainContext ctx : mainCtx) {
            if (ctx.function() != null) {
                mainBody.add(new FunctionVisitor().visit(ctx.function()));
            } else if (ctx.declaration() != null) {
                mainBody.addAll(new DeclarationVisitor().visit(ctx.declaration()));
            } else if (ctx.initialization() != null) {
                mainBody.add(new InitializationVisitor().visit(ctx.initialization()));
            } else if (ctx.statement_body() != null) {
                mainBody.add(new Statement_bodyVisitor().visit(ctx.statement_body()));
            }
        }
        return mainBody;
    }

    private List<Declaration> dataTypeControl(List<Body> mainBody, List<Declaration> declarations, List<Function> functions) {
        for (Body body : mainBody) {
            // kontrola funkci
            if (body.getClass().equals(Function.class)) {
                Function new_func = (Function) body;
                // kontrola deklarace existujici funkce
                for (Function func : functions) {
                    if (new_func.getIdent().equals(func.getIdent())) {
                        throw new RuntimeException("Function " + new_func.getIdent() + " already exists.");
                    }
                }
                dataTypeControl(new_func.getFuncBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                functions.add(new_func);
            }

            // kontrola deklaraci
            else if (body.getClass().equals(Declaration.class)) {
                Declaration new_dec = (Declaration) body;
                if (new_dec.isParameter()) {
                    declarations.add(new_dec);
                    continue;
                }

                // kontrola deklarace existujici deklarace
                for (Declaration dec : declarations) {
                    if (new_dec.getIdent().equals(dec.getIdent())) {
                        throw new RuntimeException("Variable " + new_dec.getIdent() + " already exists.");
                    }
                }
                // kontrola datoveho typu
                if (new_dec.getInitialization() != null) {
                    // kontrola datoveho typu hodnoty s datovym typem promenne
                    if (new_dec.getInitialization().getAssignment().getExpression().getValue() != null) {
                        if (new_dec.getDataType() != new_dec.getInitialization().getAssignment().getExpression().getValue().getDataType())
                            throw new RuntimeException("Variable " + new_dec.getIdent() + " has wrong data type of value.");
                        // kontrola datoveho typu prirazeni s datovym typem promenne
                    } else {
                        for (Declaration dec2 : declarations) {
                            if (dec2.getIdent().equals(new_dec.getInitialization().getAssignment().getExpression().getIdent())) {
                                if (new_dec.getDataType() != dec2.getDataType())
                                    throw new RuntimeException("Variable " + new_dec.getIdent() + " has wrong data type of value.");
                                break;
                            }
                        }
                    }
                }
                declarations.add(new_dec);
            }
            // kontrola inicializaci
            else if (body.getClass().equals(Initialization.class)) {
                Initialization new_ini = (Initialization) body;
                initializationControl(declarations, new_ini);
            }
            // kontrola statement body
            else if (body.getClass().equals(StatementBody.class)) {
                StatementBody new_sb = (StatementBody) body;
                // kontrola existujici volane funkce
                calledFuncControl(functions, new_sb);
                // kontrola existence promennych ve volane funkci
                for (String iniVar : new_sb.getIniVariables()) {
                    boolean correctIdent = false;
                    for (Declaration dec : declarations) {
                        // kontrola existence promenne
                        if (dec.getIdent().equals(iniVar)) {
                            correctIdent = true;
                            break;
                        }
                    }
                    if (!correctIdent)
                        throw new RuntimeException("Variable " + iniVar + " not exists.");
                }

                // kontrola condition
                if (new_sb.getConditionals() != null) {
                    // kontrola vetve if
                    // kontrola promenne v hlavicce
                    expressionIdentControl(new_sb.getConditionals().getIc().getExp().getIdent(), declarations);

                    dataTypeControl(new_sb.getConditionals().getIc().getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));

                    // kontrola vetve else
                    if (new_sb.getConditionals().getEc() != null) {
                        dataTypeControl(new_sb.getConditionals().getEc().getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                    }
                }

                // kontrola cyklu
                if (new_sb.getCycles() != null) {
                    switch (new_sb.getCycles().getCycleType()) {
                        case FOR:
                            ForCycle fc = (ForCycle) new_sb.getCycles();
                            // kontrola deklarace v hlavicce
                            for (Declaration new_dec : fc.getDeclarations()) {
                                for (Declaration dec : declarations) {
                                    if (new_dec.getIdent().equals(dec.getIdent())) {
                                        throw new RuntimeException("Variable " + new_dec.getIdent() + " already exists.");
                                    }
                                }
                            }

                            // kontrola promenne v hlavicce
                            expressionIdentControl(fc.getExp().getIdent(), declarations);

                            // kontrola inicializace v hlavicce
                            Initialization new_ini = fc.getInitialization();
                            initializationControl(declarations, new_ini);

                            declarations.addAll(fc.getDeclarations());
                            // kontrola statement
                            dataTypeControl(fc.getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));

                            // smazani deklaraci hlavicky cyklu
                            for (int i = 0; i < fc.getDeclarations().size(); i++) {
                                declarations.remove(declarations.size() - 1);
                            }
                            break;

                        case WHILE:
                            // kontrola while
                            WhileCycle wc = (WhileCycle) new_sb.getCycles();
                            // kontrola expression
                            expressionIdentControl(wc.getExp().getIdent(), declarations);
                            // kontrola statement
                            dataTypeControl(wc.getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                            break;

                        case DO_WHILE:
                            // kontrola do while
                            DoWhileCycle dwc = (DoWhileCycle) new_sb.getCycles();
                            // kontrola statement
                            List<Declaration> decs = dataTypeControl(dwc.getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                            declarations.addAll(decs);
                            // kontrola expression
                            expressionIdentControl(dwc.getExp().getIdent(), declarations);
                            // smazani deklaraci ze statementu
                            for (int i = 0; i < decs.size(); i++) {
                                declarations.remove(declarations.size() - 1);
                            }
                            break;

                        case REPEAT:
                            // kontrola repeat
                            RepeatCycle rc = (RepeatCycle) new_sb.getCycles();
                            // kontrola statement
                            List<Declaration> decs2 = dataTypeControl(rc.getStatement().getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));
                            declarations.addAll(decs2);
                            // kontrola expression
                            expressionIdentControl(rc.getExp().getIdent(), declarations);
                            // smazani deklaraci ze statementu
                            for (int i = 0; i < decs2.size(); i++) {
                                declarations.remove(declarations.size() - 1);
                            }
                            break;

                        case SWITCH:
                            // kontrola switch
                            SwitchCycle sc = (SwitchCycle) new_sb.getCycles();
                            // kontrola expression
                            expressionIdentControl(sc.getExp().getIdent(), declarations);
                            for (Case case_body : sc.getCases()) {
                                // kontrola case hlavicky
                                if (case_body.getAssignment().getExpression().getIdent() != null) {
                                    expressionIdentControl(case_body.getAssignment().getExpression().getIdent(), declarations);
                                }
                                // kontrola statement v case body
                                dataTypeControl(case_body.getStatementBody(), new ArrayList<>(declarations), new ArrayList<>(functions));

                            }
                            break;

                    }
                }
            }

        }
        return declarations;
    }

    private void expressionIdentControl(String expIdent, List<Declaration> declarations) {
        // kontrola promenne v hlavicce
        boolean correctIdent = false;
        for (Declaration dec : declarations) {
            // kontrola existence promenne
            if (dec.getIdent().equals(expIdent)) {
                correctIdent = true;
                break;
            }
        }
        if (!correctIdent)
            throw new RuntimeException("Variable " + expIdent + " not exists.");
    }

    private void calledFuncControl(List<Function> functions, StatementBody new_sb) {
        if (new_sb.getCalledFunction() != null) {
            boolean correctFunc = false;
            for (Function func : functions) {
                if (func.getIdent().equals(new_sb.getCalledFunction())) {
                    correctFunc = true;
                    break;
                }
            }
            if (!correctFunc)
                throw new RuntimeException("Function " + new_sb.getCalledFunction() + " not exists.");
        }
    }

    private void initializationControl(List<Declaration> declarations, Initialization new_ini) {
        boolean correctIdent = false;
        for (Declaration dec : declarations) {
            // kontrola existence promenne
            if (dec.getIdent().equals(new_ini.getName())) {
                correctIdent = true;
                // kontrola datoveho typu promenne s hodnotou inicializace
                if (new_ini.getAssignment().getExpression().getValue() != null) {
                    if (dec.getDataType() != new_ini.getAssignment().getExpression().getValue().getDataType())
                        throw new RuntimeException("Initialization " + new_ini.getName() + " has wrong data type of value");
                }
                // kontrola datoveho typu promenne s datovym typem prirazeni
                else {
                    String ident = new_ini.getAssignment().getExpression().getIdent();
                    for (Declaration dec1 : declarations) {
                        if (ident.equals(dec1.getIdent())) {
                            if (dec.getDataType() != dec1.getDataType())
                                throw new RuntimeException("Initialization " + new_ini.getName() + " has wrong data type of value");
                        }
                    }
                }
            }
        }
        if (!correctIdent)
            throw new RuntimeException("Variable " + new_ini.getName() + " not exists.");
    }

//    private void dataTypeControl(List<Declaration> declarations, List<Function> functions, List<Initialization> initializations, List<StatementBody> statementBodies) {
////    private void dataTypeControl(List<StatementBody> mainBody) {
//        for (StatementBody sb : statementBodies) {
//            calledFuncControl(functions, sb);
//        }
//        for (Declaration dec : declarations) {
//            if (dec.getInitialization() != null) {
//                if (dec.getInitialization().getAssignment().getValue() != null) {
//                    if (dec.getDataType() != dec.getInitialization().getAssignment().getValue().getDataType())
//                        throw new RuntimeException("Variable " + dec.getIdent() + " has wrong data type of value.");
//
//                } else {
//                    for (Declaration dec2 : declarations) {
//                        if (dec2.getIdent().equals(dec.getInitialization().getAssignment().getExpression().getIdent())) {
//                            if (dec.getDataType() != dec2.getDataType())
//                                throw new RuntimeException("Variable " + dec.getIdent() + " has wrong data type of value.");
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//
//        for (Initialization ini : initializations) {
//            boolean correctIdent = false;
//            for (Declaration dec : declarations) {
//                if (dec.getIdent().equals(ini.getName())) {
//                    correctIdent = true;
//                    if (ini.getAssignment().getValue() != null) {
//                        if (dec.getDataType() != ini.getAssignment().getValue().getDataType())
//                            throw new RuntimeException("Initialization " + ini.getName() + " has wrong data type of value");
//                    } else {
//                        String ident = ini.getAssignment().getExpression().getIdent();
//                        for (Declaration dec1 : declarations) {
//                            if (ident.equals(dec1.getIdent())) {
//                                if (dec.getDataType() != dec1.getDataType())
//                                    throw new RuntimeException("Initialization " + ini.getName() + " has wrong data type of value");
//                            }
//                        }
//                    }
//                }
//                if (!correctIdent)
//                    throw new RuntimeException("Variable " + dec.getIdent() + " not exists.");
//            }
//        }
//    }
//
//    private AllVariables getVariables(List<GrammarParser.MainContext> mainsCtx) {
//        AllVariables vars = new AllVariables();
//        List<Declaration> separated_declarations;
//        Initialization initialization;
//
//        for (GrammarParser.MainContext mainCtx : mainsCtx) {
//            if (mainCtx.declaration() != null) {
//                separated_declarations = new DeclarationVisitor().visit(mainCtx.declaration());
//
//                for (Declaration separated_declaration : separated_declarations) {
//                    if (separated_declaration.getInitialization() != null) {
//                        if (separated_declaration.getInitialization().getAssignment() != null) {
//                            boolean correct_ident = false;
//                            String ident = separated_declaration.getInitialization().getAssignment().getExpression().getIdent();
//                            checkAssignmentIdent(vars, correct_ident, ident);
//                        }
//                    }
//
//                    for (Declaration declaration : vars.getDeclarations())
//                        if (separated_declaration.getIdent().equals(declaration.getIdent()))
//                            throw new RuntimeException("Variable " + separated_declaration.getIdent() + " already exists.");
//
//                    vars.getDeclarations().add(separated_declaration);
//                }
//            } else if (mainCtx.initialization() != null) {
//                initialization = new InitializationVisitor().visit(mainCtx.initialization());
//
//                boolean correct_var = false;
//                boolean correct_ident = false;
//                for (Declaration declaration : vars.getDeclarations()) {
//
//                    if (initialization.getName().equals(declaration.getIdent())) {
//                        if (declaration.isConstant())
//                            throw new RuntimeException("Variable " + initialization.getName() + " is constant - can not be changed.");
//                        correct_var = true;
//                        break;
//                    }
//                }
//                if (!correct_var)
//                    throw new RuntimeException("Variable " + initialization.getName() + " not exists.");
//
//                String ident = initialization.getAssignment().getExpression().getIdent();
//                checkAssignmentIdent(vars, correct_ident, ident);
//
//                vars.getInitializations().add(initialization);
//            }
//        }
//
//        return vars;
//    }
//
//    private void checkAssignmentIdent(AllVariables vars, boolean correct_ident, String ident) {
//        if (ident != null) {
//            for (Declaration declaration : vars.getDeclarations()) {
//                if (ident.equals(declaration.getIdent())) {
//                    correct_ident = true;
//                    break;
//                }
//            }
//            if (!correct_ident)
//                throw new RuntimeException("Variable " + ident + " not exists.");
//
//        }
//    }
//
//    private List<Function> getFunction(List<GrammarParser.MainContext> mainsCtx) {
//        List<Function> functions = new ArrayList<>();
//        Function new_function;
//
//        for (GrammarParser.MainContext mainCtx : mainsCtx) {
//            if (mainCtx.function() != null) {
//                new_function = new FunctionVisitor().visit(mainCtx.function());
//
//                for (Function function : functions)
//                    if (new_function.getIdent().equals(function.getIdent()))
//                        throw new RuntimeException("Function name " + new_function.getIdent() + " already exists.");
//
//                functions.add(new_function);
//            }
//        }
//
//        return functions;
//    }
//

}
