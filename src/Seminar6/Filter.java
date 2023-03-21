package Seminar6;


import java.util.Scanner;

public class Filter {
    public static void filter(int count) {
        Scanner scanner = new Scanner(System.in);
        if (count == 1) {
            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = scanner.nextInt();
            if (ram >= 32) {
                System.out.printf(Catalog.n3.toString());
            } else if (ram >= 16 && ram < 32) {
                System.out.printf(Catalog.n4.toString() );
            } else if (ram >= 8 && ram < 16) {
                System.out.printf("Таких ноутбуков нет!");
            } else if (ram >= 4 &&ram < 8) {
                System.out.printf(Catalog.n1.toString() + "\n" + Catalog.n2.toString());
            } else System.out.println("Таких ноутбуков нет!");

        } else if (count == 2) {

            System.out.printf("Введите значение SSD: ");
            Integer ssd = scanner.nextInt();
            if (ssd >= 512) {
                System.out.printf(Catalog.n3.toString());
            } else if (ssd >= 256 && ssd < 512) {
                System.out.printf(Catalog.n2.toString() + "\n" + Catalog.n4.toString());
            } else if (ssd >= 128 && ssd < 256) {
                System.out.printf(Catalog.n1.toString() );
            } else System.out.println("Таких ноутбуков нет!");

        } else if (count == 3) {

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if (os.equals("Windows")) {
                System.out.printf(Catalog.n1.toString() + "\n" + Catalog.n2.toString() + "\n" + Catalog.n4.toString() + "\n" + Catalog.n3.toString() + "\n");
            } else if (os.equals("Windows 10")) {
                System.out.printf(Catalog.n1.toString() + "\n" + Catalog.n3.toString());
            } else if (os.equals("Windows 11")) {
                System.out.printf(Catalog.n2.toString() + "\n" + Catalog.n4.toString());
            } else System.out.println("Таких ноутбуков нет!");
            sc1.close();
        }

        scanner.close();
    }
}

