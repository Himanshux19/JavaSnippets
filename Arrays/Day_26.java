// Day 26 : Move zeros to end

import java.util.*;

class Day_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array");
        int[] arr = new int[n];
        for (int k = 0; k < n; k++)
            arr[k] = sc.nextInt();
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0)
                arr[i++] = arr[j];
        }
        Arrays.fill(arr, i, n, 0);
        System.out.println("Resultant Array");
        for (int l = 0; l < n; l++)
            System.out.print(arr[l] + " ");
        sc.close();
    }
}