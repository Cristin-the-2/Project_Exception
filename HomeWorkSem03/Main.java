package HomeWorkSem03;

import HomeWorkSem03.Exceptions.BirthDateException;
import HomeWorkSem03.Exceptions.InputFormatException;
import HomeWorkSem03.Exceptions.InputLengthException;
import HomeWorkSem03.WorkWithData.Input;
import HomeWorkSem03.WorkWithData.ParsData;
import HomeWorkSem03.WorkWithData.WriteToTxt;

public class Main {
    public static void main(String[] args) {
        try {
            Input input = new Input();
            String[] inputArray = input.getData();
            ParsData parsData = new ParsData();
            String[] outputArray = parsData.parsInput(inputArray);
            WriteToTxt write = new WriteToTxt();
            write.writeData(parsData.parsToTxt(outputArray), "HomeWorkSem03/Data/" + outputArray[0] + ".txt");
        } catch (InputLengthException | InputFormatException | BirthDateException e) {
            e.printStackTrace();
        }
    }
}
