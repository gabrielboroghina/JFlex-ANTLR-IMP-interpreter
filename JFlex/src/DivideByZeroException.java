public class DivideByZeroException extends Exception {
    public DivideByZeroException(int srcFileLine) {
        super("DivideByZeroException " + srcFileLine);
    }
}
