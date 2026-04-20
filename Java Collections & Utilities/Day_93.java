// Day 93 : Fail-fast vs fail-safe iterator

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Day_93 {
    public static void main(String[] args) {
        System.out.println("Fail-Fast Example:");
        try {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int val = it.next();
                System.out.println(val);
                if (val == 2)
                    list.add(4);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("\nFail-Safe Example:");
        CopyOnWriteArrayList<Integer> safeList = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3));
        for (Integer val : safeList) {
            System.out.println(val);
            if (val == 2)
                safeList.add(4);
        }
        System.out.println("Final List: " + safeList);
    }
}