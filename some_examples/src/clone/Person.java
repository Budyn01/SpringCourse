package clone;

/**
 * Created by Budyn on 03.03.2018.
 */
public class Person implements Cloneable {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "reflection.Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
