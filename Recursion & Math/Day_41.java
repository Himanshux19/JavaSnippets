// Day 41 : Factorial (recursive)

import java.util.*;

public class Day_41 {
    public static long fact(int x) {
        if (x < 2)
            return 1;
        else
            return x * fact(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        long res = fact(x);
        System.out.println("The factorial of the Number is : " + res);
        sc.close();
    }
}