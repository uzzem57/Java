package SeminarExceptions.HomeWork2.Task2;

public class Solution {
    public static void main(String[] args) {
        try {
            int d = 0;
            int [] intArray = new int[]{1,2,3,4,5,6,77,8,9,90};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
