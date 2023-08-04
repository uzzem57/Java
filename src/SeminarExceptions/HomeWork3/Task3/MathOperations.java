package SeminarExceptions.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.List;

public class MathOperations {

    public static void main(String[] args) {

        System.out.println(new Add().add(2,3));
        System.out.println(new Subtract().subtract(2,3));
        System.out.println(new Multiply().multiply(2,3));
        System.out.println(new Divide().divide(2,3));
        System.out.println(new Pow().pow(2,3));
    }
}
