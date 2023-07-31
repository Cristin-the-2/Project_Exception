package Seminar03.Task04;

public class MyArraySizeException extends IllegalArgumentException {
    public MyArraySizeException(int size, int length) {
        super("Размер массива должен быть " + size + "*" + size + ", текущий размер " + length);
    }
}
