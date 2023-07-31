package Seminar03.Task03;

public class NullElementException extends NullPointerException {
    public NullElementException() {
        super("Обращение к пустому элементу.");
    }
}
