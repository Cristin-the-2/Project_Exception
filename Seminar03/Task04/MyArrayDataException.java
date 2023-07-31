package Seminar03.Task04;

public class MyArrayDataException extends IllegalArgumentException{
    public MyArrayDataException(int i, int j) {
        super("Элемент с индексом [" + i + ", " + j + "] невозможно преобразовать.");
    }
}
