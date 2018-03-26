package pl.budyn.bean_factory.marta;

/**
 * Created by Budyn on 09.03.2018.
 */
public class Main {

    String s;


    private class SomeClass extends Throwable {

    }

    public int metoda() throws SomeClass {
        if(true) throw new SomeClass();
        return 1;
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.metoda();
        } catch (SomeClass someClass) {
            someClass.printStackTrace();
        }

    }

}
