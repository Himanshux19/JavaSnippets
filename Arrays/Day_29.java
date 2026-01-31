// Day 29 : Subarray sum equals K

import java.util.*;

public class Day_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        int sum = 0, left = 0;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > k && left <= right)
                sum -= arr[left++];
            if (sum == k) {
                for (int i = left; i <= right; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
        System.out.println("No Subarray found");
        sc.close();
    }
}