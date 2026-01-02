// Day 1 : Hello World + Java program structure

import java.util.*;

public class Day_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.next();
        System.out.println("Hello " + name + " !");
        sc.close();
    }
}