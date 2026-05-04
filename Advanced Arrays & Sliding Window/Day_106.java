// Day 106 : Maximum Average Subarray I

import java.util.Scanner;

class Day_106 {
    public static double findMaxAverage(int[] nums, int k) {
        double max = Double.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        max = Math.max(max, (double) sum / k);
        int left = 0;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[left++] + nums[i];
            max = Math.max(max, (double) sum / k);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Minimum size Subarray sum : " + findMaxAverage(arr, k));
    }
}