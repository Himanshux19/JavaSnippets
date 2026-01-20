// Day 18 : Convert string to integer (manual)

import java.util.*;

public class Day_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String (Only Numeric Values) : ");
        String s = sc.next();
        long num = 0;
        for (int i = 0; i < s.length(); i++)
            num = num * 10 + s.charAt(i) - '0';
        System.out.println(num);
        sc.close();
    }
}