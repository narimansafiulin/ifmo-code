/**
 * Nariman Safiulin (woofilee)
 * File: AbstractOperation.java
 * Created on: Mar 24, 2016
 */

package expression;

public abstract class AbstractOperation implements Operation {
    private final ExpressionObject left;
    private final ExpressionObject right;

    AbstractOperation(ExpressionObject left, ExpressionObject right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(int x) {
        return operate(left.evaluate(x), right.evaluate(x));
    }

    @Override
    public double evaluate(double x) {
        return operate(left.evaluate(x), right.evaluate(x));
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return operate(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }
}
