package Seminar3.hw1;

import Seminar3.hw1.model.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта
 * среди товаров, название которых содержит «высший».
 */

public class hw1 {
    public static void main(String[] args) {
        Items item = new Items("высший", 154, "3 сорт");
        Items item1 = new Items("низший", 122, "1 сорт");
        Items item2 = new Items("высший", 187, "1 сорт");
        Items item3 = new Items("средний", 104, "2 сорт");

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item);
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);

        int countPrice = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals("высший") && itemsList.get(i).getSort().equals("1 сорт")
                    || itemsList.get(i).getSort().equals("2 сорт")) {
                if (itemsList.get(i).getPrice() > countPrice) {
                    countPrice = itemsList.get(i).getPrice();
                }

            }

        }
        System.out.println("Наибольшая цена товара - " + countPrice);

    }
}
