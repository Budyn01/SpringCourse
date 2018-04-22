import java.util.HashMap;

/**
 * Created by Budyn on 21.04.2018.
 */
public class Game {

    HashMap<Character, Integer> map;

    public int solution(String A, String B) {
        int alecWins = 0;
        init();
        if(A.length() != B.length()) throw new IllegalArgumentException();
        for (int i = 0; i < A.length(); i++) {
            if(map.get(A.charAt(i)) > map.get(B.charAt(i))) {
                alecWins++;
            }
        }
        return alecWins;
    }

    private void init() {
        map = new HashMap<>(13);
        map.put('A', 14);
        map.put('K', 13);
        map.put('Q', 12);
        map.put('J', 11);
        map.put('T', 10);
        map.put('9', 9);
        map.put('8', 8);
        map.put('7', 7);
        map.put('6', 6);
        map.put('5', 5);
        map.put('4', 4);
        map.put('3', 3);
        map.put('2', 2);
    }

}
