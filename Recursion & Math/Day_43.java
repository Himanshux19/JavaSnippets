// Day 43 : Sum of digits (recursive)

import java.util.*;

public class Day_43 {
    public static int sumOfDig(int x) {
        if (x == 0)
            return 0;
        return (x % 10) + sumOfDig(x / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        long res = sumOfDig(x);
        System.out.println("The Sum of Digit of Number is : " + res);
        sc.close();
    }
}