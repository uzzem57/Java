package test;

public class Cat extends Animals implements Doing{
    private String name;

    public Cat(String name) {
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
        System.out.println("Cat running");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");;
    }
}
