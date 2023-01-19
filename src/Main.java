import antlr.GrammarLexer;
import antlr.GrammarParser;

import instruction.InstructionGenerator;
import tree.Program;
import visitor.GrammarVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String [] args) {
        checkArguments(args);

//        String javaClassContent = "int cislo = 5 ;";

        GrammarLexer lexer = null;
        try {
            lexer = new GrammarLexer(CharStreams.fromFileName(args[0]));
//            lexer = new GrammarLexer(CharStreams.fromString(javaClassContent));
        } catch (IOException e) {

        }
        assert lexer != null;

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.program();

        Program program = new GrammarVisitor().visit(tree);
//        InstructionGenerator insGenerator = new InstructionGenerator(program);
//        ArrayList<String> instructionList = insGenerator.generateInstructions();
        List<String> instructionList = InstructionGenerator.generateInstructions(program);
        instructionToOutput(args[1] + "/ins_" + new File(args[0]).getName(), (ArrayList<String>) instructionList);

    }

    private static void instructionToOutput(String fileName, ArrayList<String> instructions) {
        try (PrintWriter out = new PrintWriter(fileName)) {
            for (String instruction : instructions) {
                out.println(instruction);
            }
//            out.println(instructions);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void checkArguments(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Invalid counts of arguments.");
        }

        if (!new File(args[0]).isFile()) {
            throw new IllegalArgumentException("First arguments is not a file.");
        }

        if (!new File(args[1]).isDirectory()) {
            throw new IllegalArgumentException("Second argument is not a directory.");
        }

    }
}
