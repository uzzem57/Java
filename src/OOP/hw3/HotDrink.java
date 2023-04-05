package OOP.hw3;

public class HotDrink extends Drinkables implements Comparable<HotDrink>{

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
        return super.toString() + ", " + "температура напитка - " + temperature;
    }

    @Override
    public int compareTo(HotDrink o) {
        return this.getTemperature() - o.getTemperature();
    }
}
