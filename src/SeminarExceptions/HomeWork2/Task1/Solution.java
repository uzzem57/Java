package SeminarExceptions.HomeWork2.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите дробное число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while(flag) {
            try {
                String inputData = reader.readLine();
                float f = Float.parseFloat(inputData);
                System.out.println(" Вы ввели число - " + f);
                flag = false;
            }
            catch (NumberFormatException | IOException e) {
                System.out.println("Вы ввели не дробное число, попробуйте еще раз ");
            }
        }
        reader.close();
    }
}
// В задании не указано, но можно вставить дополнительную проверку через contains,
// что бы пользователь вводил именно число с точкой.
