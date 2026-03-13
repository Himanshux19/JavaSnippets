// Day 70 : Evaluate Postfix Expression

import java.util.Scanner;
import java.util.Stack;

public class Day_70 {
    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch))
                stack.push(ch - '0');
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expression : ");
        String exp = sc.next();
        int result = evaluatePostfix(exp);
        System.out.println("Result: " + result);
        sc.close();
    }
}