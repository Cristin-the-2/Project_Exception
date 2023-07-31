package HomeWorkSem03.WorkWithData;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {
    public void writeData(String data, String filePath){
        try(FileWriter fw = new FileWriter(filePath, true)) {
            fw.append(data);
            fw.append("\n");
            System.out.println("Сохранение данных прошло успешно!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
