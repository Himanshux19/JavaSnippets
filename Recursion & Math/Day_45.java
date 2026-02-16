// Day 45 : LCM of two numbers

import java.util.*;

public class Day_45 {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = lcm(a, b);
        System.out.print("The GCD of two numbers is " + res);
        sc.close();
    }
}