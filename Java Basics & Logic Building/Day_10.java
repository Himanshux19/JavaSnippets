// Day 10 : Count digits in a number

import java.util.*;

public class Day_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        long n = sc.nextLong();
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("Number of Digits : " + count);
        sc.close();
    }
}