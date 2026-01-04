// Day 3 : Check even or odd

import java.util.*;

public class Day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
        sc.close();
    }
}