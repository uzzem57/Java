package SeminarExceptions.HomeWork3.Task3;

public class Divide {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return a / b;
    }
}
