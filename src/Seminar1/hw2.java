package Seminar1;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        int sum= 0;
        int post = 0;
        int sum_out = 0;
        while((post = scanner.nextInt()) != 0) {
            if (post > 0) {
                sum = post;
            }
            else {
                sum_out+=sum;
            }
        }
        System.out.println(sum_out);
        }
}
