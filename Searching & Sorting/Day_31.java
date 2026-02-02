// Day 31 : Linear Search

import java.util.*;

public class Day_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the Element : ");
        int x = sc.nextInt();
        boolean flag = false;
        int p = 0;
        for (p = 0; p < n; p++) {
            if (arr[p] == x) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "Element found at index " + p : "Element is not present in the Array");
        sc.close();
    }
}