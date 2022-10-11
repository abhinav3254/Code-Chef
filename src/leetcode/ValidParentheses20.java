package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses20 {
    public static void main(String[] args) {
        String s = "(";
        ValidParentheses20 parentheses20 = new ValidParentheses20();
        System.out.println(parentheses20.isValid(s));
    }
    public boolean isValid(String expr) {
        Deque<Character> stack
                = new ArrayDeque<>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }

        return (stack.isEmpty());

    }
}
