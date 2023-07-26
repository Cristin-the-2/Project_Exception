package Lection02;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

// import java.util.Collections;
// import java.util.List;

// import java.io.File;

public class Application {
    public static void main(String[] args) {
        //NullPointerException
        // String name = null;
        // System.out.println(name.length());

        //ClassCastException
        // Object object = new String("123");
        // File file = (File) object;
        // System.out.println(file);

        //NumberFormatException
        // String number = "123fq";
        // int result = Integer.parseInt(number);
        // System.out.println(result);

        //UnsupportedOperationException
        // List<Object> emptyList = Collections.emptyList();
        // emptyList.add(new Object());
        
        int number = 1;
        try {
            number = 10/1;
            String test = "123";
            System.out.println(test.length());
            Collections.emptyList().add(new Object());
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя.");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(number);
        FileReader test = null;
        try {
            test = new FileReader("Lection01/TestFile.txt");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
        }
    }
}
