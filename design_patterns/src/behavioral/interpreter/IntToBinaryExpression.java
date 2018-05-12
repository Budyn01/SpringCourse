package behavioral.interpreter;

/**
 * Created by Budyn on 06.05.2018.
 */
public class IntToBinaryExpression implements Expression {
    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
