package SeminarExceptions.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Subtract {
    /**
     * Метод, который выполняет вычитание двух чисел.
     *
     * @param a Уменьшаемое число.
     * @param b Вычитаемое число.
     * listSubtract - история операций вычетания с подстановкой даты и времени совершения.
     * @return Результат вычитания b из a.
     */
    public int subtract(int a, int b) {
        List<String> listSubtract = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append('-');
        builder.append(b);
        builder.append("=");
        builder.append(a-b);
        builder.append('-');
        Date date = new Date();
        builder.append(date);
        String result = builder.toString();
        listSubtract.add(result);
        return a - b;
    }
}
