package finalize_example;

import static java.lang.Thread.sleep;

/**
 * Created by Budyn on 03.03.2018.
 */


public class Main {

    static class Number {
        public int value;

        @Override
        public String toString() {
            return "Number{" +
                    "value=" + value +
                    '}';
        }
    }
    /**No elo */
    private void valueChange(Number i) {
        i.value += 5;
    }

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        Number number = new Number();
        number.value = 5;
        main.valueChange(number);
        System.out.println(number);
    }

}
