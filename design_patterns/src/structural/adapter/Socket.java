package structural.adapter;

/**
 * Created by Budyn on 06.05.2018.
 */
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
