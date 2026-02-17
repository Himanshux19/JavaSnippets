// Day 46 : Print all subsequences

import java.util.*;

public class Day_46 {

    public static void printSubseq(String s, int idx, String curr) {
        if (idx == s.length()) {
            System.out.println(curr);
            return;
        }
        printSubseq(s, idx + 1, curr + s.charAt(idx));
        printSubseq(s, idx + 1, curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        printSubseq(s, 0, "");
        sc.close();
    }
}
