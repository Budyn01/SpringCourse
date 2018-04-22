import org.junit.Test;

/**
 * Created by Budyn on 21.04.2018.
 */
public class NullTest {

    public void method(Object object) {
        System.out.println("C1");
    }

    public void method(String string) {
        System.out.println("C2");
    }

    int a = 5;

    @Test
    public void test() {
        System.out.println(a);
        int a = 2;
        System.out.println(a);
    }


}
