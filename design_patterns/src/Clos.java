import java.io.*;
import java.util.ArrayList;
import java.util.List;

class MyResource1 implements AutoCloseable {
    public void close() throws Exception { // A1
        System.out.print("1 ");
    }
}

class MyResource2 implements Closeable {
    public void close() { // A2
        System.out.print("2 ");
    }
}

public class Clos {
    public static void main(String[] args) throws IOException {
        try {
            MyResource1 r1 = new MyResource1(); // B1
            MyResource2 r2 = new MyResource2();
            // B2
            System.out.print("t ");
        } finally {
            System.out.print("f ");
        }

    }
}


class Forever {
    public static void main(String[] args) {
        List x1 = new ArrayList();
        List x2 = new ArrayList<>();
    }
}
