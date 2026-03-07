// Day 64 : Next Greater Element

import java.util.*;

public class Day_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Element");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            if (st.isEmpty())
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(arr[i]);
        }
        System.out.println("Resultant Array");
        for (int x : res)
            System.out.print(x + " ");
        sc.close();
    }
}