package OOP.cw1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Snickers",100.00));
        machine.addProduct(new Product("Coca-cola",120.00));
        machine.addProduct(new Product("Lays",80.00));

        System.out.println(machine.getProductByName("Coca-cola"));

        System.out.println(machine.getProductByPrice(80.0));
    }


}
