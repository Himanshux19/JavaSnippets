// Day 92 : HashMap vs TreeMap

import java.util.*;

public class Day_92 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(3, "C");
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(null, "NullKey");

        System.out.println("HashMap Output:");
        for (Map.Entry<Integer, String> entry : hm.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(3, "C");
        tm.put(1, "A");
        tm.put(2, "B");

        System.out.println("\nTreeMap Output:");
        for (Map.Entry<Integer, String> entry : tm.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}