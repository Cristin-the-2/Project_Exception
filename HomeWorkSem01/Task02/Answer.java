package HomeWorkSem01.Task02;

public class Answer {
    public int[] subArrays(int[] a, int[] b) {
        int[] c = new int[] { 0 };
        if (a.length == b.length) {
            c = new int[a.length];
            for (int i = 0; i < c.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        return c;
    }
}