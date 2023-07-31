package SeminarExceptions.HomeWork2.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите значение или строку: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (5>3) {
            String name = reader.readLine();
            if (name == null || name.isEmpty()) {
                throw new RuntimeException("Вы ввели пустую строку");
            } else
                System.out.println("Вы ввели - " + name);
        }
    }
}
