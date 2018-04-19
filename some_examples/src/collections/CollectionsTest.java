package collections;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Budyn on 19.04.2018.
 */
public class CollectionsTest {

    List<String> list;

    @Before
    public void setup() {
        list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add("Element " + i);
        }
    }

    @Test
    public void streamTest() {
        list.parallelStream().map((x) -> {
            int wait = (int) (Math.random() * 1000 * 5);
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return x + " " + wait;
        }).forEach(System.out::println);
        System.out.println("Siema");
    }
}
