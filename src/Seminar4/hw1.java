package Seminar4;

import java.util.*;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */

public class hw1 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов");
        Deque<Integer> myList = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println("Введите элементы");
        for (int i = 0; i < count; i++) {
            myList.add(scanner.nextInt());
        }
        while(myList.size() != 0){
            System.out.print(myList.pollLast() + " ");
        }
    }
}
