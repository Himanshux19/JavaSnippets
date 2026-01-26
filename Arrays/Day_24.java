// Day 24 : Remove duplicates from sorted array

import java.util.*;

class Day_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Sorted Array");
        int[] arr = new int[n];
        for (int k = 0; k < n; k++)
            arr[k] = sc.nextInt();
        int i = 0, j = 1;
        while (j != n) {
            if (arr[i] == arr[j])
                j++;
            else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        System.out.println("Resultant Array");
        for (int k = 0; k <= i; k++)
            System.out.print(arr[k] + " ");
        sc.close();
    }
}