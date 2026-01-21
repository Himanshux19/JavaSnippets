// Day 19 : String compression

import java.util.*;

public class Day_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.next();
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            char p = s.charAt(i - 1);
            if (c == p)
                count++;
            else {
                res.append(p).append(count);
                count = 1;
            }
        }
        res.append(s.charAt(s.length() - 1)).append(count);
        System.out.println("Original String : " + s + "\nCompressed String : " + res);
        sc.close();
    }
}