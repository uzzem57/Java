package OOP.hw1;

public abstract class Product {

    private String name;
    private int volume;


    public Product() {
    }


    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int price) {
        this.volume = price;
    }

    @Override
    public String toString() {
        return "\"" + name + "\" объем: - " + volume + " " ;
    }
}
