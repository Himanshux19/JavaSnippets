// Day 85 : Subarray with Zero Sum

import java.util.*;

public class Day_85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        if (subarrayWithZeroSum(arr))
            System.out.println("Yes, Subarray with zero sum exists");
        else
            System.out.println("No such subarray exists");

        sc.close();
    }

    public static boolean subarrayWithZeroSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;
        for (int num : nums) {
            prefixSum += num;
            if (prefixSum == 0 || set.contains(prefixSum))
                return true;
            set.add(prefixSum);
        }
        return false;
    }
}