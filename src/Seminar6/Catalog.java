package Seminar6;

public class Catalog extends Laptop {
    static Laptop n1 = new Laptop(1, 2, 128, "Windows 10", "Grey");
    static Laptop n2 = new Laptop(2, 4, 256, "Windows 11", "Red");
    static Laptop n3 = new Laptop(3, 32, 512, "Windows 10", "Grey");
    static Laptop n4 = new Laptop(4, 16, 256, "Windows 11", "Black");

    public Catalog(int id, int ram, int ssd, String os, String color) {
        super(id, ram, ssd, os, color);
    }

}
