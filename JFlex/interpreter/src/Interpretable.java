import java.util.HashMap;

public interface Interpretable {
    Object interpret(HashMap<String, Integer> varList) throws UnassignedVarException, DivideByZeroException;
}
