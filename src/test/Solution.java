package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
 * (a ^ p + b ^ (p+1) + c ^ (p+2) + d ^ (p+3) + ...) = n * k
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(digPow(46288, 3));
    }

    public static long digPow(int n, int p) {
        String[] array = String.format("%d", n).split("");
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + Math.pow(Integer.parseInt(array[i]), p);
            p++;
        }
        if (count % n == 0) {
            return (long) (count / n);
        } else {
            return -1;
        }
    }
}






