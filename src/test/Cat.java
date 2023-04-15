package test;

public class Cat extends Animals {
    private int age;

    public Cat() {
        super();
    }
    public Cat(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayCat(){
        System.out.println("Mia");
    }
    @Override
    public String toString() {
        return String.valueOf(age);
    }

}
