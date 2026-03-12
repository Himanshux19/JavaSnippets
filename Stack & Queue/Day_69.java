// Day 69 : Min Stack

import java.util.Stack;

public class Day_69 {

    static class MinStack {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        void push(int x) {
            mainStack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        int pop() {
            if (mainStack.isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int removed = mainStack.pop();
            if (removed == minStack.peek())
                minStack.pop();
            return removed;
        }

        int top() {
            if (mainStack.isEmpty()) {
                System.out.println("Stack Empty");
                return -1;
            }
            return mainStack.peek();
        }

        int getMin() {
            if (minStack.isEmpty()) {
                System.out.println("Stack Empty");
                return -1;
            }
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(5);
        st.push(3);
        st.push(7);
        st.push(2);
        System.out.println("Min: " + st.getMin()); // 2
        st.pop();
        System.out.println("Min: " + st.getMin()); // 3
        st.pop();
        System.out.println("Top: " + st.top()); // 3
    }
}