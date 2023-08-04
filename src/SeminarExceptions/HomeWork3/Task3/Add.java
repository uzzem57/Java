package SeminarExceptions.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Add {
    /**
     * Метод, который выполняет сложение двух чисел.
     *
     * @param a Первое число для сложения.
     * @param b Второе число для сложения.
     * listAdd - история операций сложения с подстановкой даты и времени совершения.
     * @return Результат сложения a и b.
     */
    public static int add(int a, int b) {
        List<String > listAdd = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append('+');
        builder.append(b);
        builder.append("=");
        builder.append(a+b);
        builder.append('-');
        Date date = new Date();
        builder.append(date);
        String result = builder.toString();
        listAdd.add(result);

        return a + b;
    }
}
