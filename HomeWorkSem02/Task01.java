package HomeWorkSem02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* 
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
        и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
        приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. 
        */
        float number;
        do {
            number = askFloatNumber();
        } while (Float.isNaN(number));
        System.out.println("Вы ввели число: " + number);
    }

    public static float askFloatNumber() {
        float number = Float.NaN;
        try {
            System.out.print("Введите дробное число: ");
            Scanner sc = new Scanner(System.in);
            number = Float.parseFloat(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Введено неверное значение.");
        } 
        return number; 
    }
}
