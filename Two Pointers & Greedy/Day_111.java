// Day 111 : Container With Most Water

import java.util.Scanner;

class Day_111 {
    public static int maxArea(int[] arr) {
        int i = 0, j = arr.length - 1;
        int res = 0;
        while (i < j) {
            int width = j - i;
            int height = Math.min(arr[i], arr[j]);
            res = Math.max(res, width * height);
            if (arr[i] < arr[j])
                i++;
            else
                j--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Container with most water : " + maxArea(arr));
    }
}