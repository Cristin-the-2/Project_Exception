package Seminar01;

public class Main {
    /*
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
     * Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
     * в качестве кода ошибки, иначе - длину массива.
     */
    public static void main(String[] args) {
        int[] array = new int[] { 2, 6, 7, 63 };
        System.out.println(checkLength(array));
    }

    static int checkLength(int[] arr) {
        int minLength = 5;
        if (arr.length < minLength) {
            return -1;
        }
        return arr.length;
    }
}
