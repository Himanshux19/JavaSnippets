// Day 2 : Swap two numbers (without temp)

import java.util.*;

public class Day_2_ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping\na : " + a + " b : " + b);
        sc.close();
    }
}