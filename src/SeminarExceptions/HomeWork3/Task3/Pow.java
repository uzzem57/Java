package SeminarExceptions.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pow {
    /**
     * Метод, который выполняет возведение в степень.
     *
     * @param a основание.
     * @param b показатель.
     * listPow - история операций возведения в степень с подстановкой даты и времени совершения.
     * @return Результат возведения в степень.
     */
    public int pow(int a, int b) {
        List<String> listPow = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append('^');
        builder.append(b);
        builder.append("=");
        builder.append((int) Math.pow(a, b));
        builder.append('-');
        Date date = new Date();
        builder.append(date);
        String result = builder.toString();
        listPow.add(result);

        return (int) Math.pow(a, b);
    }
}
