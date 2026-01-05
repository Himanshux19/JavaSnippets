// Day 4 : Find maximum of 3 numbers

import java.util.*;

public class Day_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three Number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Max of " + a + " " + b + " " + c + " is " + max);
        sc.close();
    }
}