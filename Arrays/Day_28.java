// Day 28 : Prefix sum array

import java.util.*;

class Day_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array");
        int[] arr = new int[n];
        for (int k = 0; k < n; k++)
            arr[k] = sc.nextInt();
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        System.out.println("Prefix Sum Array");
        for (int l = 0; l < n; l++)
            System.out.print(prefixSum[l] + " ");
        sc.close();
    }
}