// Day 32 : Binary Search (recursive)

import java.util.*;

public class Day_33 {
    public static int binarySearch(int[] arr, int x, int beg, int end) {
        int idx = -1;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (arr[mid] == x) {
                idx = mid;
                return mid;
            } else if (arr[mid] > x)
                return binarySearch(arr, x, beg, mid - 1);
            else
                return binarySearch(arr, x, mid + 1, end);
        }
        return idx;
    }

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
        int idx = binarySearch(arr, x, 0, n - 1);
        System.out.println(idx > -1 ? "Element found at index " + idx : "Element not found");
        sc.close();
    }
}