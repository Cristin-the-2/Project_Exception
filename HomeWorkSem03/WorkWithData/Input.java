package HomeWorkSem03.WorkWithData;

import java.util.Scanner;

import HomeWorkSem03.Exceptions.InputLengthException;

public class Input {

    public String[] getData() throws InputLengthException {

        try (Scanner scanner = new Scanner(System.in, "cp866")) {
            System.out.print(
                    "Введите информацию через пробел: \n-фамилия имя отчество\n-дата рождения - формата dd.mm.yyyy\n-номер телефона - только цифры без +\n-пол - одной буквой f/m\n --> ");
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            if (inputArray.length != 6) {
                throw new InputLengthException(inputArray.length);
            }
            return inputArray;
        }
    }
}
