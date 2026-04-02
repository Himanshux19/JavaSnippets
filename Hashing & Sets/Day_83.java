// Day 83 : Intersection of two arrays

import java.util.*;

public class Day_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array1 : ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the length of Array2 : ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        Set<Integer> hs = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int x : arr1)
            hs.add(x);
        for (int x : arr2) {
            if (hs.contains(x))
                res.add(x);
        }
        int[] ans = new int[res.size()];
        int i = 0;
        for (int x : res)
            ans[i++] = x;
        System.out.print("Intersected Array is : ");
        for (int x : ans)
            System.out.print(x + " ");
        sc.close();
    }
}