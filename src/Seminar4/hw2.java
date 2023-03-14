package Seminar4;
/**
 * https://leetcode.com/problems/valid-parentheses/
 */

import java.util.Stack;

public class hw2 {
    public static void main(String[] args) {
        String s = "([]){}";
        System.out.println(isValid(s));

    }

    /**
     *
     * @param s - входная строка символов
     * @return результат проверки правильности чередования символов во входной строке
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
