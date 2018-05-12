package behavioral.interpreter;

/**
 * Created by Budyn on 06.05.2018.
 */
public class InterpreterContext {
    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }
    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}
