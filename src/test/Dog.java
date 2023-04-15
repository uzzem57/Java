package test;

public class Dog extends Animals {
    private int age;

    public Dog() {
        super();
    }
    public Dog(int age){
        this.age = age;
    }
    @Override
    public String toString() {
        return String.valueOf(age);
    }
}
