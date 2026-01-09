// Day 8 : Fibonacci (recursive)

import java.util.*;

public class Day_8 {
    public static int fibonacci(int n) {
        if (n <= 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.print(fibonacci(i) + " ");
        sc.close();
    }
}