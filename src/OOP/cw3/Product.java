package OOP.cw3;

public abstract class Product {
    private String name;
    private Double price;
    private int volume;

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

      public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }

    @Override
    public String toString() {
        return " name = " + name + " price = " + price + " volume = " + volume;
    }
}
