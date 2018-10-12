package algorithms;

import java.util.Stack;

public class Valid_Parentheses_020 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if ((c == ')' && left != '(') || (c == '}' && left != '{') || (c == ']' && left != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
