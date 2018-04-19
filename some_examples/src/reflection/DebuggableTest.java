package reflection;

import org.junit.Test;

/**
 * Created by Budyn on 19.04.2018.
 */
public class DebuggableTest {

    @Test
    public void debuggableTest() {
        Person person = new Person(1, 2, "Wojtek");
        System.out.println(person.debug());
    }
}
