package Seminar03.Task04;

public class Main4 {
    /*
     * 1. Напишите метод, на вход которого подаётся двумерный строковый массив
     * размером 4х4. При подаче массива другого размера необходимо бросить
     * исключение MyArraySizeException.
     * 2. Далее метод должен пройтись по всем элементам массива, преобразоватьв
     * int и просуммировать. Если в каком-то элементе массива преобразование
     * не удалось (например, в ячейке лежит символ или текст вместо числа),
     * должно быть брошено исключение MyArrayDataException с детализацией, в
     * какой именно ячейке лежат неверные данные.
     * 3. В методе main() вызвать полученный метод, обработать возможные
     * исключения MyArraySizeException и MyArrayDataException и вывести
     * результат расчета (сумму элементов, при условии что подали на вход
     * корректный массив).
     */
    public static void main(String[] args) {
        String[][] array = new String[][] { 
                                            { "2", "1", "5", "6" }, 
                                            { "3", "4", "7", "8" }, 
                                            { "2", "1", "5", "6" },
                                            { "3", "4", "7", "8" }
                                        };
        try {
            System.out.println(getSum(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int getSum(String [][] array) {
        int sum = 0;
        int size = 4;
        if (array.length != size) {
            throw new MyArraySizeException(size, array.length);
        }
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                throw new MyArraySizeException(size, array[1].length);
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                sum += Integer.parseInt(array[i][j]);
            }
        }
        return sum;
    }
}
