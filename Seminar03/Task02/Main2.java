package Seminar03.Task02;

import java.io.IOException;

public class Main2 {
    /* 
    Создайте класс Счетчик, у которого есть метод add(), увеличивающий
    значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
    такого типа можно было работать в блоке try-with-resources. Нужно бросить
    исключение, если работа с объектом типа счетчик была не в ресурсном try
    и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
    лучше всего. 
    */
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            System.out.println(counter.getCount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
