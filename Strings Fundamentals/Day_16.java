// Day 16 : Check Anagram

import java.util.*;

public class Day_16 {
    public static boolean isAnagram(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n != m)
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for (int x : freq) {
            if (x != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2) ? "Anagram" : "Not Anagram");
        sc.close();
    }
}