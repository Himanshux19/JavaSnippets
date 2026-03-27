// Day 81 : Frequency count using HashMap

import java.util.*;

public class Day_81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++)
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        System.out.println("Frequency");
        for (Map.Entry<Integer, Integer> en : hm.entrySet())
            System.out.println(en.getKey() + " " + en.getValue());
        sc.close();
    }
}