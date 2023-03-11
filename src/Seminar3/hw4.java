package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
 * Пример входных данных:
 * [1,2,3]
 * Пример выходных данных:
 * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

public class hw4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(combo(arr));
    }

    /**
     * Метод реализует все возможные перестановки в массиве
     *
     * @param arr
     * @return (ArrayList) myArr
     */
    public static ArrayList combo(int[] arr) {
        int count = fuctorial(arr.length);
        int max = arr.length - 1;
        int shift = max;
        List<String> myArr = new ArrayList<>();
        while (count > 0) {
            int t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            myArr.add(Arrays.toString(arr));
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
        return (ArrayList) myArr;
    }

    /**
     * Нахождение факториала, для понимания количества комбинаций
     */
    public static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
    }
}

