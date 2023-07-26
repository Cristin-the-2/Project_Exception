package HomeWorkSem02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
         * Разработайте программу, которая выбросит Exception, когда пользователь вводит
         * пустую строку.
         * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
         */
        String string;
        do {
            string = askString();
        } while (string.isEmpty());
        System.out.println("Вы ввели строку: " + string);
    }

    public static String askString() {
        String string = "";
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
        if (string.isEmpty()) {
            System.out.println("Пустые строки вводить нельзя.");
            return "";
        } else {
            return string;
        }
    }
}
