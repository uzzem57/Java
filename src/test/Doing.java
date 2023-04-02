package test;

public interface Doing {
    void run();
    void jump();
default void sleep(){
    System.out.println("default");
}
}
