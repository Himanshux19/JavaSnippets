// Day 82 : Two Sum problem

import java.util.*;

public class Day_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter target Sum : ");
        int target = sc.nextInt();
        int[] res = twoSum(arr, target);
        System.out.println(res[0]+" , "+res[1]);
        sc.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (mp.containsKey(rem))
                return new int[] { mp.get(rem), i };
            mp.put(nums[i], i);
        }
        return new int[] {};
    }
}