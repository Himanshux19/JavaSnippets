// Day 2 : Swap two numbers (with temp)

import java.util.*;

public class Day_2_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping\na : " + a + " b : " + b);
        sc.close();
    }
}