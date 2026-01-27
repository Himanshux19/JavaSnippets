// Day 25 : Rotate array by K

import java.util.*;

public class Day_25 {

    public static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Sorted Array");
        int[] arr = new int[n];
        for (int k = 0; k < n; k++)
            arr[k] = sc.nextInt();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        k %= n;
        reverse(arr, 0, n - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, k - 1);
        System.out.println("Resultant Array");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
}