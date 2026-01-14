// Day 13 : Count vowels & consonants

import java.util.*;

public class Day_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        int vowel = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) != -1)
                vowel++;
            else
                consonants++;
        }
        System.out.println("Vowel : " + vowel + "\nConsonants : " + consonants);
        sc.close();
    }
}