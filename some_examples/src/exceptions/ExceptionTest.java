package exceptions;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by Budyn on 21.04.2018.
 */
public class ExceptionTest {

    @Test
    public void main() {
        try {
            method1();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        method2();
        System.out.println("Siema xD");
    }

    public void method1() throws IOException {
        throw new IOException("Method1");
    }

    public void method2() throws IllegalArgumentException {
        throw new IllegalArgumentException("Method2");
    }

    public void method3() {


        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
