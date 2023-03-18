package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 */

public class hw2 {
    public static void main(String[] args) {
        String s = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String myStr = s.replace('.', ' ').replace('—', ' ').toLowerCase().replaceAll("\\s+", " ");
        String[] myArray = myStr.split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        System.out.println("Введите слово для поиска");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(input) && !myMap.containsKey(myArray[i])) {
                myMap.put(myArray[i], 1);
            } else if (myArray[i].equals(input) && myMap.containsKey(myArray[i])) {
                myMap.put(myArray[i], myMap.get(myArray[i]) + 1);
            }
        }
        if (myMap.isEmpty()) {
            System.out.println("Введеное слово не встречается в заданном предложении!");
        } else {
            for (var entry : myMap.entrySet()) {
                System.out.println("Слово " + "\"" + entry.getKey() + "\"" + " встретилось - " + entry.getValue() + " раз(а)");
            }
        }

    }

}
