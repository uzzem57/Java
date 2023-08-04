package SeminarExceptions.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Multiply {
    /**
     * Метод, который выполняет умножение двух чисел.
     *
     * @param a Первый множитель.
     * @param b Второй мнввожитель.
     * listMultiply - история операций умножения с подстановкой даты и времени совершения.
     * @return Результат умножения a на b.
     */
    public int multiply(int a, int b) {
        List<String> listMultiply = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append('*');
        builder.append(b);
        builder.append("=");
        builder.append(a*b);
        builder.append('-');
        Date date = new Date();
        builder.append(date);
        String result = builder.toString();
        listMultiply.add(result);
        return a * b;
    }
}
