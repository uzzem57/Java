package Seminar2;

import java.util.Arrays;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива
 */
public class hw3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 99, 10, -4, -5, -77, 9, 8};
        System.out.println(Arrays.toString(changeArr(array)));
    }
    public static int [] changeArr(int [] array){
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 & array[i] < 100 | array[i] > -100 & array[i] < -9) {
                sumIndex += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = sumIndex;
            }
        }
        return array;
    }
}
