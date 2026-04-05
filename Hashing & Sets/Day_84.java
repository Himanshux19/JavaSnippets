// Day 84 : Longest consecutive sequence

import java.util.*;

public class Day_84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("The Longest Consecutive Subsequence is " + longestConsecutive(arr));
        sc.close();
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : nums)
            hs.add(x);
        int longest = 0;
        for (int num : hs) {
            if (!hs.contains(num - 1)) {
                int current = num;
                int count = 1;
                while (hs.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
