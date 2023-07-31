package HomeWorkSem03.Exceptions;

public class BirthDateException extends Exception {
    public BirthDateException(int error) {
        if (error == 0) {
            System.out.println("Введен не верный формат даты рождения - dd.mm.yyyy.");
        }
        else if (error == 1) {
            System.out.println("Введен не верный формат даты рождения - число рождения не может быть нулем, отрицательным или больше 31.");
        }
        else if (error == 2) {
            System.out.println("Введен не верный формат даты рождения - месяц рождения не может быть нулем, отрицательным или больше 12.");
        }
        else if (error == 3) {
            System.out.println("Введен не верный формат даты рождения - год рождения не может быть нулем, отрицательным или больше 2023.");
        }
    }
}
