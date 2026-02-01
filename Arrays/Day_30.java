// Day 30 : Kadane’s Algorithm (Max Subarray)

import java.util.*;

public class Day_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int maxSum = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Max Subarray Sum : " + maxSum);
        sc.close();
    }
}