package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {

        int[] array = new int[]{};
        System.out.println(sequence(array));
    }

    public static int sequence(int[] arr) {
        if (arr.length != 0) {
            int[] newArray = Arrays.copyOfRange(arr, 3, 7);
            int count = 0;
            for (int i = 0; i < newArray.length; i++) {
                if (newArray[i] < 0) {
                    count++;
                }
            }
            if (count == newArray.length) {
                return 0;
            } else if (newArray.length == 0) {
                return 0;
            } else {
                int count1 = 0;
                for (int i = 0; i < newArray.length; i++) {
                    count1 = count1 + newArray[i];
                }
                return count1;
            }

        }
        else
            return 0;
    }
}
