package HomeWorkSem02;

public class Task02 {
    public static void main(String[] args) {
        /* Если необходимо, исправьте данный код */
        try {
            //int d = 0;
            int d = 1;
            int[] intArray = new int[]{1,2,3,4,5,6,7,8};
            //int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
            //int[] intArray = null;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException | IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Catching exception: " + e.getClass().getSimpleName());
         } 
         
    }
}
