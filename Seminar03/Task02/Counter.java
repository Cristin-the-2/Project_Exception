package Seminar03.Task02;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private int count;
    private boolean closed;

    public void add() throws IOException{
        if (closed) {
            throw new IOException("Ресурс закрыт и не может быть использован");
        }
        count++;
    }

    public boolean isClosed() {
        return closed;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Ресурс закрыт");
    }
}
