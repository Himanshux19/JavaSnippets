// Day 48 : Tower of Hanoi

import java.util.*;

public class Day_48 {

    public static void toh(int n, char src, char aux, char dest) {
        if (n == 0)
            return;
        toh(n - 1, src, dest, aux);
        System.out.println(src + " -> " + dest);
        toh(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Disk : ");
        int n = sc.nextInt();
        toh(n, 'A', 'B', 'C');
        sc.close();
    }
}
