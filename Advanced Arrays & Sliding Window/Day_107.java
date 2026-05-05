// Day 107 : Longest substring without repeating

import java.util.HashMap;
import java.util.Scanner;

class Day_107 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c))
                j = Math.max(j, hm.get(c) + 1);
            hm.put(c, i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(
                "Length of the longest substring without duplicate characters : " + lengthOfLongestSubstring(s));
    }
}