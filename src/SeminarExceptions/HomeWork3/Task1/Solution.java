package SeminarExceptions.HomeWork3.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Основной класс взаимодействия с пользователем.
 */
public class Solution {
    public static void main(String[] args) throws ComplianceCheckException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Введите желаемый пароль: ");
            String inputText = reader.readLine();
            System.out.println(PasswordVerifier.complianceCheck(inputText));
        }
        catch (IOException e){
            System.out.println("Ошибка ввода");
        }
        catch (ComplianceCheckException e) {
            System.out.println( "Ошибка: " + e.getMessage());
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static class PasswordVerifier {

        /**
         * Метод проверки соответствия введеного пользователя пароля принятым правилам безопасности.
         * @param s Строка введеная пользователем.
         * @return Результат проверки соответсвия пароля нормам.
         * @throw ComplianceCheckException В зависимости от причины несоответствия.
         */
        public static String complianceCheck(String s) throws ComplianceCheckException {
            if (s.length() < 8){
                throw new ComplianceCheckException("Пароль меньше 8 символов");
            }
            else if(checkDigit(s) == true){
                throw new ComplianceCheckException("Пароль не содержит цифру");
            }
            else if (checkUpperCase(s)){
                throw new ComplianceCheckException("Пароль не содержит заглавную буквы");
            }
            else {
                return "Пароль принят";
            }

        }
        /**
         * Метод проверки на наличие цифры во введеном пароле..
         * @param s Строка введеная пользователем.
         * @return Результат проверки на наличие числа в пароле.
         */
        public static boolean checkDigit(String s) {
            boolean valid = true;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    valid = false;
                    break;
                }
            }
            return valid;
        }
        /**
         * Метод проверки на наличие заглавной буквы во введеном пароле..
         * @param s Строка введеная пользователем.
         * @return Результат проверки на наличие заглавной буквы в пароле.
         */
        public static boolean checkUpperCase(String s) {
            boolean valid = true;
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c) && Character.isUpperCase(c)) {
                    valid = false;
                    break;
                }
            }
            return valid;
        }
    }

    /**
     * Класс возможных исключений при регистрации пользователем новго пароля.
     */
     static class ComplianceCheckException extends Exception {
        public ComplianceCheckException (String message){
            super(message);
        }
    }
}
