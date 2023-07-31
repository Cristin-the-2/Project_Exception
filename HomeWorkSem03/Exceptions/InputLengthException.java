package HomeWorkSem03.Exceptions;

public class InputLengthException extends Exception {
    public InputLengthException(int size) {
        if (size > 6) {
            System.out.println("Вы ввели больше данных, чем требуется.");
        } else {
            System.out.println("Вы ввели недостаточно данных, чем требуется.");
        }
    }
}
