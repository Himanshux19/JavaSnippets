// Day 117 : Assign Cookies

import java.util.*;

class Day_117 {
    public static int findContentChildren(int[] g, int[] s) {
        int res = 0;
        int i = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
                j++;
                res++;
            } else
                j++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        System.out.println("Output : " + findContentChildren(arr1, arr2));
    }
}