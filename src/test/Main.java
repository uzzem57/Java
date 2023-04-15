package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animals>myList = new ArrayList<>();
        myList.add(new Animals(2));
        myList.add(new Animals(3));

        List<Dog> myList1 = new ArrayList<>();
        myList1.add(new Dog(2));
        myList1.add(new Dog(5));

        test(myList);
        test(myList1);

    }
        public static void test(List<? extends Animals> list){
        for (Animals animal:list) {
            System.out.println(animal);

        }
    }
}
