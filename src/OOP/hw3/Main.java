package OOP.hw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();
        List<HotDrink> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffe", 2, 100.25, 90),
                new HotDrink("Tea", 1, 50.15, 95),
                new HotDrink("Milk", 3, 20.50, 50)));
        machine.initProduct(hotDrinksList);

        Collections.sort(hotDrinksList);
        Iterator iterator = hotDrinksList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
