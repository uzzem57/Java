package OOP.cw3;

public class ProductChocolad extends Product {
    public int getShugar() {
        return shugar;
    }

    public void setShugar(int shugar) {
        this.shugar = shugar;
    }

    private int shugar;
    public ProductChocolad(String name, Double price) {

        super(name, price);
    }

    public ProductChocolad(String name, Double price, int shugar) {
        super(name, price);
        this.shugar = shugar;
    }
    public ProductChocolad(String name, Double price,int shugar, int volume) {
        super(name, price);
        this.shugar = shugar;
        this.setVolume(volume);
    }
}
