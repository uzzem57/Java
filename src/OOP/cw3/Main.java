package OOP.cw3;


public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new ProductWater("Fanta",100.00));
        machine.addProduct(new ProductWater("Coca-cola",120.00));
        machine.addProduct(new ProductChocolad("Snickers",50.00));
        machine.addProduct(new ProductChocolad("Mars",60.00,2));
        machine.addProduct(new ProductChocolad("Bounty",20.00,10,5));

        System.out.println(machine.getProductByName("Bounty",5));

    }


}
