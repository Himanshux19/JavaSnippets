// Day 122 : Min in rotated array

import java.util.*;

class Day_122 {
    public static int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] > nums[j])
                i = mid + 1;
            else
                j = mid;
        }
        return nums[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Output : " + findMin(arr));
    }
}