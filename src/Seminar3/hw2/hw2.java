package Seminar3.hw2;

import Seminar3.hw2.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */

public class hw2 {
    public static void main(String[] args) {
        Items item = new Items("ноутбук", "китай", 3, 200, "высший");
        Items item1 = new Items("монитор", "тайланд", 2, 120, "1 сорт");
        Items item2 = new Items("принтер", "япония", 4, 150, "2 сорт");
        Items item3 = new Items("мфу", "франция", 9, 120, "1 сорт");


        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item);
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);

        Scanner scanner = new Scanner(System.in);
        String seachSort = scanner.nextLine();
        int countPrice = itemsList.get(0).getPrice();
        scanner.close();
        /**
         * Проход для определения минимальной цены
         */
        for (int i = 1; i < itemsList.size(); i++) {
            if (itemsList.get(i).getSort().contains(seachSort)) {
                if (itemsList.get(i).getPrice() < countPrice) {
                    countPrice = itemsList.get(i).getPrice();
                }
            }

        }
        /**
         * Проход для добавления, если товар с минимальной ценой не один
         */
        List<String> name = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getSort().contains(seachSort) && itemsList.get(i).getPrice() == countPrice) {
                name.add(itemsList.get(i).getName());
            }
        }

        System.out.println(name);

    }
}
