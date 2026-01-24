// Day 22 : Find largest & smallest element

import java.util.*;

public class Day_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array Element : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Largest : " + max + "\nSmallest : " + min);
        sc.close();
    }
}