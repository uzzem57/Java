package Seminar5;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */

public class hw1 {
    public static void main(String[] args) {
        String s = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String myStr = s.replace('.', ' ').replace('—', ' ').toLowerCase().replaceAll("\\s+", " ");
        String[] myArray = myStr.split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < myArray.length; i++) {
            if (!myMap.containsKey(myArray[i])) {
                myMap.put(myArray[i], 1);
            } else {
                myMap.put(myArray[i], myMap.get(myArray[i]) + 1);
            }
        }
        for (var entry : myMap.entrySet()) {
            System.out.println("Слово " + "\"" + entry.getKey() + "\"" +" встретилось - " + entry.getValue() + " раз(а)");
        }
    }
}

