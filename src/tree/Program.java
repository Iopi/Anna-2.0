package tree;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Program {

    List<SingleDeclaration> declarations;
    List<Function> functions;

}
