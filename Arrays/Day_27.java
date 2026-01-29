// Day 27 : Count occurrences of an element

import java.util.*;

class Day_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array");
        int[] arr = new int[n];
        for (int k = 0; k < n; k++)
            arr[k] = sc.nextInt();
        System.out.println("Enter the Element : ");
        int k = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr)
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        int count = hm.get(k);
        System.out.println("Occurence : " + count);
        sc.close();
    }
}