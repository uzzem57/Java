package test;


import java.text.DecimalFormat;

//        1 --> 1 --> "1.00"
//        2 --> 1 + 1/4 --> "1.25"
//        5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
public class Solution {
    public static void main(String[] args) {
        System.out.println(seriesSum(63));
    }
    public static String seriesSum(int n) {
        Double sum = 0.0;
        if (n == 0) {
            return "0.00";
        }
        else if ( n == 1){
            return "1.00";
        }
        else if (n == 2){
            return "1.25";
        }
        Double cons = 1.25;
        int count = 7;

        for (int i = 3; i <= n; i++) {
            sum = sum + (1.00/count);
            count+=3;
        }
        String result = String.format("%.2f",sum+ cons);

        return result;
    }
}
