// Day 120 : Gas Station

import java.util.*;

class Day_120 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int currGas = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            currGas += diff;
            totalGas += diff;
            if (currGas < 0) {
                res = i + 1;
                currGas = 0;
            }
        }
        return totalGas >= 0 ? res : -1;
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
        System.out.println("Output : " + canCompleteCircuit(arr1, arr2));
    }
}