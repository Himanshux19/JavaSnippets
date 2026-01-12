// Day 11 : Reverse a string

import java.util.*;

public class Day_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev = rev + s.charAt(i);
        System.out.println("Original String : " + s + "\nReversed String : " + rev);
        sc.close();
    }
}