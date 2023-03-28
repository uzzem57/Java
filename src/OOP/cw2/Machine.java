package OOP.cw2;

import java.util.ArrayList;

public interface Machine {
    public ArrayList getProductByName(String searchName);
    public ArrayList getProductByPrice(Double searchPrice);
    public void addProduct(Product newItem);
}
