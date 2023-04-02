package OOP.hw2;

public abstract class Animals implements Speakable{
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String text = String.format("name: %s, age: %d", this.name, this.age);
        return text;
    }
    public abstract String say();
}
