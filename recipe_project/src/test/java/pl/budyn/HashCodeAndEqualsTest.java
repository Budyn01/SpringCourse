package pl.budyn;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Budyn on 02.04.2018.
 */
public class HashCodeAndEqualsTest {

    class Person {
        private int name;

        public Person(int name) {
            this.name = name;
        }

        public int getName() {
            return name;
        }

        public void setName(int name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return name == person.name;
        }

        @Override
        public int hashCode() {

            return Objects.hash(name);
        }
    }

    Person person1;
    Person person2;
    Person person3;

    @Before
    public void setUp() throws Exception {
        person1 = new Person(1);
        person2 = new Person(1);
        person3 = new Person(2);
    }

    @Test
    public void hashCodeTest() throws Exception {
        assertEquals(person1.hashCode(), person2.hashCode());
        assertTrue(person1.equals(person2));
        assertFalse(person1.equals(person3));
    }

}
