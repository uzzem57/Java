package AttestationJava;

public class ToyCars extends ShopGames{
    private String model;


    public ToyCars(int id, String name, int volume, double toyDropRate, String model) {
        super(id, name, volume, toyDropRate);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
