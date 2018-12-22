import java.util.HashMap;

/**
 * Visitable interface used for interpreting a program described by an AST.
 */
public interface Interpretable {
    Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException;
}
