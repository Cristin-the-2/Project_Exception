package Seminar03.Task03;

public class Main3 {
    /* 
    1. Создайте класс исключения, который будет выбрасываться при делении на 0. 
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
    2. Создайте класс исключений, которое будет возникать при обращении к
    пустому элементу в массиве ссылочного типа. Исключение должно
    отображать понятное для пользователя сообщение об ошибке
    3. Создайте класс исключения, которое будет возникать при попытке открыть
    несуществующий файл. Исключение должно отображать понятное для
    пользователя сообщение об ошибке. 
    */
    public static void main(String[] args) {
        // try {
        //     System.out.println(getResult(10, 0));
        // } catch (DivisionByZeroException e) {
        //     e.printStackTrace();
        // }

        String[] array = new String[10];
        System.out.println(getElement(array, 5));
    }

    public static double getResult(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }

    public static String getElement(String[] array, int index){
        if (array[index] == null) {
            throw new NullElementException();
        }
        return array[index];
    }
}
