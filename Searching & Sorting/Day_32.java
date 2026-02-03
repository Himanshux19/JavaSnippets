// Day 32 : Binary Search (iterative)

import java.util.*;

public class Day_32 {
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
        int beg = 0, end = n - 1;
        int idx = -1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (arr[mid] == x) {
                idx = mid;
                break;
            } else if (arr[mid] > x)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        System.out.println(idx > -1 ? "Element found at index " + idx : "Element not found");
        sc.close();
    }
}