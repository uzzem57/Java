package Seminar2;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */

public class hw1 {
    public static void main(String[] args) {
        System.out.println(simpleData());
    }

    public static int simpleData() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во значений в последовательности");
        int size = scanner.nextInt();
        System.out.println("Введите последовательность чисел");
        for (int i = 0; i < size; i++) {
            int data = scanner.nextInt();
            int x = 0;
            for (int j = 1; j <= data; j++) {
                if (data % j == 0) {
                    x++;
                }
            }
            if (x == 2) {
                count += data;
            }
        }
        return count;
    }
}
