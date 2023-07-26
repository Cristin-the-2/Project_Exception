package HomeWorkSem01.Task01;

public class Printer {
    public static void main(String[] args) {
        Integer[] array = {1,2,3};
        int index = 5;
        Answer ans = new Answer(array, index);
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        ans = new Answer(10,0);
        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        ans = new Answer("Xbckj");
        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}