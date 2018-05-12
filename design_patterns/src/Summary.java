import java.util.HashMap;
import java.util.*;

interface Rideable {
    String getGait();
}

class Camel implements Rideable {
    int weight = 2;

    public String getGait() {
        return " mph, lope";
    }

    void go(int speed) {
        ++speed;
        weight++;
        int walkrate = speed * weight;
        System.out.print(walkrate + getGait());
    }

}

class Feline {
    public String type = "f ";
    public Feline() {
        System.out.print("feline ");
    }
}
class Cougar extends Feline {
    public Cougar() {
        System.out.print("cougar ");
    }
    void go() {
        type = "c ";
        System.out.print(this.type + super.type);
    }

}


public class Summary {
    public static void main(String[] args) {
        String in = "1 a 10 . 100 1000";
        Scanner s = new Scanner(in);
        int accum = 0;
        for (int x = 0; x < 4; x++) {
            accum += s.nextInt();
        }
        System.out.println(accum);
    }
}


