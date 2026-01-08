// Day 7 : Fibonacci (iterative)

import java.util.*;

public class Day_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (Greater than 2 ) : ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        sc.close();
    }
}