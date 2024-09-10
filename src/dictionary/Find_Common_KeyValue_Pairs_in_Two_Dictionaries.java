/*

 ○ Question:Write a function to find common key-value pairs between two dictionaries.
 ○ Logic:Iterate through one dictionary and check if the keys exist in the other dictionary with matching values.
 ○ SampleInput:Dict1:{"A":1,"B":2,"C":3},Dict2:{"B":2,"C":4,"D":5}
 ○ ExpectedOutput:{"B":2}

 */

package dictionary;

import java.util.HashMap;
import java.util.Map;

public class Find_Common_KeyValue_Pairs_in_Two_Dictionaries {
    public static void main(String[] args) {
        HashMap<String,Integer>dict1=new HashMap<>();
        HashMap<String,Integer>dict2=new HashMap<>();
        dict1.put("A",1);
        dict1.put("B",2);
        dict1.put("C",3);
        System.out.println(dict1);

        dict2.put("B",2);
        dict2.put("C",4);
        dict2.put("D",5);
        System.out.println(dict2);

        Map<String,Integer> com_pair=new HashMap<>();
        for(String key: dict1.keySet())
        {
            if(dict1.containsKey(key) && dict1.get(key).equals(dict2.get(key)))
            {
                com_pair.put(key,dict1.get(key));
            }
        }
        System.out.println("Common key-value pairs:");
        for (Map.Entry<String, Integer> entry : com_pair.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
