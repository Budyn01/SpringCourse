package structural.adapter;

/**
 * Created by Budyn on 06.05.2018.
 */
public class Volt {
    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

    public static void something() {
        System.out.println("Elo");
    }
}
