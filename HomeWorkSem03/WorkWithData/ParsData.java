package HomeWorkSem03.WorkWithData;

import HomeWorkSem03.Exceptions.BirthDateException;
import HomeWorkSem03.Exceptions.InputFormatException;

public class ParsData {
    public String[] parsInput(String[] inputArray) throws InputFormatException, BirthDateException {
        String[] outputArray = new String[6];
        for (int i = 0; i < 3; i++) {
            if (inputArray[i].matches("[A-Za-z]+") || inputArray[i].matches("[а-яА-Я]+")) {
                outputArray[i] = inputArray[i];
            } else throw new InputFormatException(i);
        }
        String[] birthDate;
        if (inputArray[3].matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            birthDate = inputArray[3].split("\\.");
        } else throw new BirthDateException(0);
        if (Integer.parseInt(birthDate[0]) <= 0 || Integer.parseInt(birthDate[0]) > 31) {
            throw new BirthDateException(1);
        }
        if (Integer.parseInt(birthDate[1]) <= 0 || Integer.parseInt(birthDate[1]) > 12) {
            throw new BirthDateException(2);
        }
        if (Integer.parseInt(birthDate[2]) <= 0 || Integer.parseInt(birthDate[2]) > 2023) {
            throw new BirthDateException(3);
        }
        outputArray[3] = inputArray[3];
        if (inputArray[4].matches("[0-9]+")) {
            outputArray[4] = inputArray[4];
        }
        else throw new InputFormatException(3);
        if (inputArray[5].matches("f") || inputArray[5].matches("m")) {
            outputArray[5] = inputArray[5];
        } else throw new InputFormatException(4);
        System.out.println("Данные введены верно!");
        return outputArray;
    }

    public String parsToTxt(String[] array){
        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }
}