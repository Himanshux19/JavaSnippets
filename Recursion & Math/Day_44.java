// Day 44 : GCD using Euclid

import java.util.*;

public class Day_44 {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a, b);
        System.out.print("The GCD of two numbers is " + res);
        sc.close();
    }
}