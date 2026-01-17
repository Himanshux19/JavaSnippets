// Day 15 : Character frequency (HashMap)

import java.util.*;

public class Day_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        System.out.println("Character Frequency");
        for (Map.Entry<Character, Integer> en : hm.entrySet())
            System.out.println(en.getKey() + " " + en.getValue());
        sc.close();
    }
}