package behavioral.interpreter;

/**
 * Created by Budyn on 06.05.2018.
 */
public class IntToHexExpression implements Expression {
    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(this.i);
    }
}
