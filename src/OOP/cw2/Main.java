package OOP.cw2;



public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new ProductWater("Fanta",100.00));
        machine.addProduct(new ProductWater("Coca-cola",120.00));
        machine.addProduct(new ProductChocolad("Snickers",50.00));
        machine.addProduct(new ProductChocolad("Mars",60.00,2));

        System.out.println(machine.getProductByName("Coca-cola"));

        System.out.println(machine.getProductByPrice(80.0));
    }


}
