// Day 91 : Custom Comparator sorting

import java.util.*;

class Day_91 {
    public static void main(String[] args) {
        Integer[] arr = { 5, 2, 9, 1 };

        Arrays.sort(arr, (a, b) -> Integer.compare(b, a));

        System.out.println(Arrays.toString(arr));
    }
}