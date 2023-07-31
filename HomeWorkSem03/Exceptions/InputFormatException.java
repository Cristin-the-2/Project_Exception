package HomeWorkSem03.Exceptions;

public class InputFormatException extends Exception{
    public InputFormatException(int error) {
        if (error == 0) {
            System.out.println("Фамилия введена не верно. Можно использовать только русские или английские буквы.");
        } else if (error == 1) {
            System.out.println("Имя введено не верно. Можно использовать только русские или английские буквы.");
        } else if (error == 2) {
            System.out.println("Отчество введено не верно. Можно использовать только русские или английские буквы.");
        } else if (error == 3) {
            System.out.println("Номер телефона введен не верно. Можно использовать только цифры без пробелов и иных знаков.");
        } else {
            System.out.println("Пол введен не верно. Можно использовать строго одну букву на английской раскладке - 'f' или 'm'.");
        }
    }
}
