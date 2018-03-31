package pl.budyn.recipe_project;

import org.junit.Test;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Budyn on 27.03.2018.
 */
public class OutterLoop {

    @Test
    public void test() {
        loop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("I: " + i + " J: " + j);
                if(j == i) continue loop;
            }
            System.out.println("Jo je tutaj");
        }
    }


    @Test
    public void validityTest() {
        @NotNull @Size(max = 3) int owner = 5;
        System.out.println(owner);
    }


}
