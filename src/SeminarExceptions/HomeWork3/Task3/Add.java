package SeminarExceptions.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Add {
    /**
     * Метод, который выполняет сложение двух чисел.
     *
     * @param a Первое число для сложения.
     * @param b Второе число для сложения.
     * mylist Добавление в историю операций в текстовом виде с простановкой даты и времени операции.
     * @return Результат сложения a и b.
     */
    public int add(int a, int b) {
        List<String> myList = new ArrayList<>();
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
        myList.add(result);

        return a + b;
    }
}
