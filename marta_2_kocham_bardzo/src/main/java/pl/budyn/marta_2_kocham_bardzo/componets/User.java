package pl.budyn.marta_2_kocham_bardzo.componets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Budyn on 21.02.2018.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return formatName(name);
    }

    private String formatName(String name) {
        String firstChar = name.substring(0, 1).toUpperCase();
        name = firstChar + name.substring(1, name.length()).toLowerCase();
        return name;
    }
}
