// Day 47 : Generate all permutations

import java.util.*;

public class Day_47 {

    public static void permute(char[] ch, int idx) {
        if (idx == ch.length) {
            System.out.println(new String(ch));
            return;
        }

        for (int i = idx; i < ch.length; i++) {
            swap(ch, idx, i);
            permute(ch, idx + 1);
            swap(ch, idx, i);
        }
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.next();
        permute(s.toCharArray(), 0);
        sc.close();
    }
}
