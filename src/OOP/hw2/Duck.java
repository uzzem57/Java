package OOP.hw2;

public class Duck extends Animals implements Speakable,Swimable{
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public String say() {
        return "kray kray";
    }

    @Override
    public int speedOfSwim() {
        return 3;
    }
}
