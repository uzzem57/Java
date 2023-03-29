package OOP.hw1;

import OOP.hw1.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinksList = new ArrayList<>();
    List<HotDrink> resultFind = new ArrayList<>();

    @Override
    public void initProduct() {
    }

    public void initProduct(List<HotDrink> list) {
        this.hotDrinksList = list;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        resultFind.clear();
        for (HotDrink item : hotDrinksList) {
            if (item.getName().equals(name)) resultFind.add(item);
        }
        return resultFind.toString();
    }

    public String getProduct(int temperature) {
        resultFind.clear();
        for (HotDrink item : hotDrinksList) {
            if (item.getTemperature() == temperature) resultFind.add(item);
        }
        return resultFind.toString();
    }

    public String getProduct(String name, int volume) {
        resultFind.clear();
        for (HotDrink item : hotDrinksList) {
            if (item.getName().equals(name) && item.getVolume() == volume) resultFind.add(item);
        }
        return resultFind.toString();
    }

    public String getProduct(String name, int volume, int temperature) {
        resultFind.clear();
        for (HotDrink item : hotDrinksList) {
            if (item.getName().equals(name) && item.getVolume() == volume) {
                if (item.getTemperature() == temperature) {
                    resultFind.add(item);
                }

            }

        }
        return resultFind.toString();

    }

}
