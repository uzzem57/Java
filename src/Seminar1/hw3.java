package Seminar1;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число :");
        String a = scanner.nextLine();
        System.out.println("Введите второе число :");
        String b = scanner.nextLine();
        String str = Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        System.out.println("Sum as a binary string - " + str);
    }

}
