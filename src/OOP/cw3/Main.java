package OOP.cw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        List<Product> list = new ArrayList<>();
        list.add(new BottleOfWater("fanta",10,1));
        list.add(new BottleOfWater("pepsi",18,2));
        list.add(new BottleOfWater("coca-cola",12,1));
    BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(list);

        System.out.println(machine.getProduct("peps",2));

    }
}
