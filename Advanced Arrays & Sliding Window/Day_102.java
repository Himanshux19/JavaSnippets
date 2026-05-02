// Day 102 : Minimum size subarray sum 

import java.util.Scanner;

class Day_102 {
    public static int minSizeSubarray(int[] arr, int target) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println("Minimum size Subarray sum : " + minSizeSubarray(arr, target));
    }
}