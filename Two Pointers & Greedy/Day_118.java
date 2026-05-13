// Day 118 : Jump Game

import java.util.*;

class Day_118 {
    public static boolean canJump(int[] nums) {
        int jump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > jump)
                return false;
            jump = Math.max(jump, nums[i] + i);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(canJump(arr) ? "Can Reach" : "Can't Reach");
    }
}