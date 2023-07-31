package Seminar03.Task03;

public class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException(String str) {
        super(str);
    }

    public DivisionByZeroException() {
        super("На ноль делить нельзя");
    }
}
