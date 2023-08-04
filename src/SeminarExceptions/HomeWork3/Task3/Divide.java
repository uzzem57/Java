package SeminarExceptions.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Divide {
    /**
     * Метод, который выполняет деления двух чисел.
     *
     * @param a Первый множитель.
     * @param b Второй мнввожитель.
     * listDivide - история операций деления с подстановкой даты и времени совершения.
     * @return Результат умножения a на b.
     */
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        List<String> listDivide = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append('/');
        builder.append(b);
        builder.append("=");
        builder.append(a/b);
        builder.append('-');
        Date date = new Date();
        builder.append(date);
        String result = builder.toString();
        listDivide.add(result);
        return a / b;
    }
}
