package leetcode.easy;

import java.util.*;

public class ParenthesisCheck {

    public boolean isValid(String s) {
        Stack< String > stack = new Stack < String > ();
        int length = s.length();

        if (length == 1) return false;

        for (int i = 0; i < length; i++) {
            String paranthesis = String.valueOf(s.charAt(i));
            String closeBrace = paranthesis.equals("(") ? ")" : paranthesis.equals("{") ? "}" : paranthesis.equals("[") ? "]" : null;

            if (closeBrace != null) stack.push(closeBrace);
            else {
                if (i == 0 || stack.size() <= 0 || (stack.size() > 0 && !paranthesis.equals(stack.pop()))) {
                    return false;
                }
            }
        }
        return stack.size() > 0 ? false : true;
    }

}
