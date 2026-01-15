// Day 14 : Remove spaces from string

import java.util.*;

public class Day_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                continue;
            sb.append(s.charAt(i));
        }
        System.out.println("Updated String : " + sb);
        sc.close();
    }
}