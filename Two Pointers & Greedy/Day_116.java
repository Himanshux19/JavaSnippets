// Day 116 : Dutch National Flag

import java.util.*;

class Day_116 {
    public static void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int x : nums) {
            if (x == 0)
                c0++;
            if (x == 1)
                c1++;
            if (x == 2)
                c2++;
        }
        c1 = c1 + c0;
        c2 = c2 + c1 + c0;
        for (int i = 0; i < nums.length; i++) {
            if (i < c0)
                nums[i] = 0;
            else if (i < c1)
                nums[i] = 1;
            else if (i < c2)
                nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sortColors(arr);
        System.out.print("Output : ");
        for (int x : arr)
            System.out.print(x + " ");
    }
}