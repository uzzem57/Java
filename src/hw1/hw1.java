package hw1;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку :");
        String str = scanner.nextLine();
        System.out.println(reverceStr(str));
    }

    public static String reverceStr(String str) {
        while (str.contains("  ")) {
            String replace = str.replace("  ", " ");
            str = replace;
        }
        String[] array = str.split(" ");
        String str_out = "";
        for (int i = array.length - 1; i >= 0; i--) {
            str_out = str_out + " " + array[i];
        }
        return str_out.trim();
    }

}