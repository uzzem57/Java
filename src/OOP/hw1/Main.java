package OOP.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();
        List<HotDrink> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffe", 2, 100.25, 90),
                new HotDrink("Tea", 1, 50.15, 95),
                new HotDrink("Milk", 3, 20.50, 50)));
        machine.initProduct(hotDrinksList);

        System.out.println("Поиск по названию: " + machine.getProduct("Coffe"));
        System.out.println("Поиск по температуре : " + machine.getProduct(50));
        System.out.println("Поиск по названию и объему : " + machine.getProduct("Tea",1));
        System.out.println("Поиск по названию и объему и температуре : " + machine.getProduct("Milk",3,50));
    }
}
