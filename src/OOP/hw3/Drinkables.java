package OOP.hw3;

public class Drinkables extends Product {

    private Double price;

    public Drinkables(String name, int volume, Double price) {
        super(name, volume);
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



}
