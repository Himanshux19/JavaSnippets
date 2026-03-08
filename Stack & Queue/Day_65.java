// Day 65 : Stock Span problem

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int span[] = new int[n];
        st.push(0);
        span[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();
            if (st.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - st.peek();
            st.push(i);
        }
        for (int x : span)
            System.out.print(x + " ");
        sc.close();
    }
}