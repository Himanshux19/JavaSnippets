// Day 63 : Valid parentheses

import java.util.*;

public class Day_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.next();
        System.out.println(validParenthesis(s) ? "Valid Parenthesis" : "Not a Valid Parenthesis");
        sc.close();
    }

    private static boolean isCorresponding(char o, char c) {
        if (o == '{' && c == '}')
            return true;
        else if (o == '(' && c == ')')
            return true;
        else if (o == '[' && c == ']')
            return true;
        else
            return false;
    }

    private static boolean validParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty())
                    return false;
                if (!isCorresponding(st.pop(), c))
                    return false;
            }
        }
        return st.isEmpty();
    }
}