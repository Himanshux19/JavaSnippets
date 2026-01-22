// Day 20 : Longest word in a sentence

import java.util.*;

public class Day_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String[] arr = str.replaceAll("[^a-zA-Z ]", "").split(" ");
        String res = new String();
        int max = 0;
        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
                res = s;
            }
        }
        System.out.println("Longest Word in String : " + res);
        sc.close();
    }
}