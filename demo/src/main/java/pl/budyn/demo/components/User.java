package pl.budyn.demo.components;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Budyn on 21.02.2018.
 */
@Setter
@Getter
@AllArgsConstructor
public class User {
    private String name;
    private long age;
    private String dog;
}
