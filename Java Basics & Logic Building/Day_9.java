// Day 9 : Reverse a number

import java.util.*;

public class Day_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long n = sc.nextLong();
        long num = n;
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Original : " + num + "\nReversed : " + rev);
        sc.close();
    }
}