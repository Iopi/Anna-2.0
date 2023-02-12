import antlr.GrammarLexer;
import antlr.GrammarParser;

import instruction.InstructionGenerator;
import instruction.instruction.AbstractInstruction;
import tree.Program;
import visitor.GrammarVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        checkArguments(args);

        GrammarLexer lexer = null;
        try {
            lexer = new GrammarLexer(CharStreams.fromFileName(args[0]));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.program();
        try {
            Program program = new GrammarVisitor().visit(tree);
            InstructionGenerator insGenerator = new InstructionGenerator(program);
            var instructions = insGenerator.generateInstructions();
            instructionToOutput(args[1] + "/ins_" + new File(args[0]).getName(), instructions);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    private static void instructionToOutput(String fileName, List<AbstractInstruction> instructions) {
        try (PrintWriter out = new PrintWriter(fileName)) {
            for (var instruction : instructions) {
                out.println(instruction.toString());
            }
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
