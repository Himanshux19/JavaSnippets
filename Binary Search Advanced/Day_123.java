// Day 123 : Find Peak Element

import java.util.*;

class Day_123 {
    public static int findPeakElement(int[] nums) {
        int beg = 0, end = nums.length - 1;
        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (nums[mid] > nums[mid + 1])
                end = mid;
            else
                beg = mid + 1;
        }
        return beg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Output : " + findPeakElement(arr));
    }
}