/*
○ Question:Write a function to calculate the intersection of two dictionaries(common key-value pairs).
○ Logic:Iterate through one dictionary and check if the keys exist in the other dictionary with matching values.
○ Sample Input :Dict1:{"A":1,"B":2,"C":3},Dict2:{"B":2,"C":4,"D":5}
○ Expected Output:{"B":2}
 */
package dictionary;

import java.util.HashMap;
import java.util.Map;

public class Calculate_Intersection_of_Two_Dictionaries {
    public static void main(String[] args) {
        HashMap<String,Integer>dict1=new HashMap<>();
        HashMap<String,Integer>dict2=new HashMap<>();
        dict1.put("A",1);
        dict1.put("B",2);
        dict1.put("C",3);

        dict2.put("B",2);
        dict2.put("C",4);
        dict2.put("D",5);

        System.out.println(dict1);
        System.out.println(dict2);
        for(Map.Entry<String,Integer>e: dict1.entrySet())
        {
            for(Map.Entry<String,Integer>f: dict2.entrySet())
            {
                if(e.getValue().equals(f.getValue()))
                {
                    System.out.println("{" + e.getKey() + " : " + e.getValue() + " } ");
                }
            }
        }
    }
}
