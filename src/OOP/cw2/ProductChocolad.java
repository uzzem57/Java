package OOP.cw2;

public class ProductChocolad extends Product{
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
}
