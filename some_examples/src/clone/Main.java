package clone;

/**
 * Created by Budyn on 03.03.2018.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Wojtek");
        Person personClone = (Person) person.clone();
        person.setName("Wojtek 1");
        System.out.println(personClone);

    }
}
