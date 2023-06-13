package AttestationJava;

public abstract class ShopGames{
    private int id;
    private String name;
    private int volume;
    private double toyDropRate;

    public ShopGames(int id, String name, int volume, double toyDropRate) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.toyDropRate = toyDropRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getToyDropRate() {
        return toyDropRate;
    }

    public void setToyDropRate(double toyDropRate) {
        this.toyDropRate = toyDropRate;
    }
}
