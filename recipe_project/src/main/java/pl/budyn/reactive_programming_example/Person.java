package pl.budyn.reactive_programming_example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Budyn on 31.03.2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;

    public String sayMyName() {
        return "My name is " + firstName + " " + lastName + ".";
    }
}
