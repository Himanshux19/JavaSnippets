// Day 21 : Reverse an array

import java.util.*;

public class Day_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array Elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int l = 0, r = n - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.print("Reversed Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}