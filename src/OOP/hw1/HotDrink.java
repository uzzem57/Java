package OOP.hw1;

public class HotDrink extends Drinkables{

    private int temperature;

    public HotDrink(String name, int volume, Double price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return super.toString() + "температура напитка - " + temperature;
    }
}
