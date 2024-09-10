/*
 ○ Question:Write a function to sort a dictionary by the length of its keys.
 ○ Logic:Use the sorted()function with a custom key function.
 ○ SampleInput:{"One":1,"Three":3,"Two":2}
 ○ ExpectedOutput:{"Two":2,"One":1,"Three":3
 */

package dictionary;

import java.util.*;

public class Sort_Dictionary_by_Key_Length {
    public static void main(String[] args) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        dictionary.put("One", 1);
        dictionary.put("Three", 3);
        dictionary.put("Two", 2);

        // Create a list of entries and sort by key length
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(dictionary.entrySet());
        sortedEntries.sort(Comparator.comparingInt(entry -> entry.getKey().length()));

        // Create a new LinkedHashMap to maintain order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);
    }
}
