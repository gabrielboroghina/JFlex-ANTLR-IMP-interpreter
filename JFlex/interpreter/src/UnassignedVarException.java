public class UnassignedVarException extends Exception {
    public UnassignedVarException(int srcFileLine) {
        super("UnassignedVarException " + srcFileLine);
    }
}
