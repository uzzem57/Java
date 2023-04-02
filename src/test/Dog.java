package test;

public class Dog extends Animals implements Doing{

    private String name;
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Dog running");
    }

    @Override
    public void jump() {
        System.out.println("Dog jumping");

    }

}
