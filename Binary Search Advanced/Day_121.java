// Day 121 : Search rotated array

import java.util.*;

class Day_121 {
    public static int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int sep = n - 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                sep = i;
                break;
            }
        }
        int res = binarySearch(nums, 0, sep - 1, target) == -1 ? binarySearch(nums, sep, n - 1, target)
                : binarySearch(nums, 0, sep - 1, target);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println("Output : " + search(arr, target));
    }
}