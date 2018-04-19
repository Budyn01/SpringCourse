package map_and_flatMap;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Budyn on 15.04.2018.
 */
public class Example {


    List<String> list;

    @Before
    public void setup() {
        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("Element " + i);
        }
    }

    @Test
    public void maps() {
        List<String> upperList = list.stream().map((s) -> {
            return s.toUpperCase();
        }).collect(Collectors.toList());
        System.out.println(upperList.toString());
    }

    @Test
    public void flatMaps() {
        List<List<String>> fm = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "g")
        );

        System.out.println(
                fm.stream().flatMap(Collection::stream).collect(Collectors.toList())
        );
    }



}
