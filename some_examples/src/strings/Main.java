package strings;

import java.util.Date;
import java.util.Timer;

/**
 * Created by Budyn on 03.03.2018.
 */
public class Main {

    public static void main(String[] args) {
        String firstString = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            firstString += "w";
        }
        long end = System.currentTimeMillis();

        System.out.println("Time 1:" + (end - start));



        start = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 100000000; i++) {
            stringBuilder.append("w");
        }

        end = System.currentTimeMillis();
        System.out.println("Time 2:" + (end - start));

    }
}
