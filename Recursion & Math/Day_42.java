// Day 42 : Power(x, n)

import java.util.*;

public class Day_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int x = sc.nextInt();
        System.out.print("Enter the Power : ");
        int n = sc.nextInt();
        long res = x;
        for (int i = 1; i < n; i++)
            res *= x;
        System.out.println("The Power(x,n) is : " + res);
        sc.close();
    }
}