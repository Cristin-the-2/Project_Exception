package HomeWorkSem01.Task01;

public class Answer {
    public Integer[] array;
    public int index;
    public int a;
    public int b;
    public String string;

    public Answer(Integer[] array, int index){
        this.array = array;
        this.index = index;
    }

    public Answer(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Answer(String string){
        this.string = string;
    }

    public void arrayOutOfBoundsException() {
        if (array.length < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
      
}

    public void divisionByZero() {
        if (b == 0) {
            throw new ArithmeticException();
        }
      
}

    public void numberFormatException() {
        if (!string.matches("[-+]?\\d+")) {
            throw new NumberFormatException();
        }
       
 }
}