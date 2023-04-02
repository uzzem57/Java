package OOP.hw2;

public class Dog extends Animals implements Speakable,Runable{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String say() {
        return "Gav";
    }

    @Override
    public int speedOfRun() {
        return 15;
    }
}
