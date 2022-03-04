package ProLambda;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        try {
            int c = calc.devide.apply(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
