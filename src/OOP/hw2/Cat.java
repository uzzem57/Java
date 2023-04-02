package OOP.hw2;

public class Cat extends Animals implements Speakable,Runable{
    private String color;
    public Cat(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }
    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public String say() {
        return "mayu";
    }

}
