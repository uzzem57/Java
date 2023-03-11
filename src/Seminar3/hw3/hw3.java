package Seminar3.hw3;

import Seminar3.hw3.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */

public class hw3 {
    public static void main(String[] args) {
        Items item = new Items("Азбука", "Иванов", 50, 2010, 74);
        Items item1 = new Items("Букварь", "Петрова", 70, 2005, 73);
        Items item2 = new Items("Словарь", "Сидоров", 100, 2017, 700);
        Items item3 = new Items("Java. Пособие для начинающих", "Амелин", 350, 2020, 11);


        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item);
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);

        List<String> name = new ArrayList<>();

        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getSecondName().contains("А") || itemsList.get(i).getSecondName().contains("а") &&
                    itemsList.get(i).getAge() >= 2010) {
                if (simpleData(itemsList.get(i).getVolume())) {
                    name.add(itemsList.get(i).getNameTitle());
                }
            }
        }
        System.out.println(name);

    }

    /**
     * Проверка простого числа
     */
    public static boolean simpleData(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
