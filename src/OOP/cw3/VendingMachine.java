package OOP.cw3;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}