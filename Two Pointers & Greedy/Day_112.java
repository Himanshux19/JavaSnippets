// Day 112 : Trapping Rain Water

import java.util.Scanner;

class Day_112 {
    public static int trap(int[] height) {
        int n = height.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = height[0];
        rmax[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], height[i]);
            rmax[n - i - 1] = Math.max(rmax[n - i], height[n - i - 1]);
        }
        int res = 0;
        for (int i = 0; i < n; i++)
            res += (Math.min(rmax[i], lmax[i]) - height[i]);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("water it can trap after raining : " + trap(arr));
    }
}