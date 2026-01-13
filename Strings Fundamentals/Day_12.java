// Day 12 : Check palindrome string

import java.util.*;

public class Day_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev = rev + s.charAt(i);
        System.out.println(rev.equals(s) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}