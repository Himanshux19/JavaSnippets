// Day 101 : Longest subarray sum ≤ K

import java.util.Scanner;

class Day_101 {
    public static int longestSubarrayLeqK(int[] arr, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Longest Subarray Length : " + longestSubarrayLeqK(arr, k));
    }
}