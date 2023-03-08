package Seminar2;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей
 */

public class hw2 {
    public static void main(String[] args) {
        System.out.println(upper());
    }

    public static boolean upper() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во значений в последовательности");
        int size = scanner.nextInt();
        System.out.println("Введите последовательность чисел");
        int first = scanner.nextInt();
        for (int i = 1; i < size; i++) {
            int next = scanner.nextInt();
            if (next > first) {
                first = next;
            } else {
                return false;
            }
        }
        return true;
    }
}
