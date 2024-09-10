/*
○ Question:Write a function to check if one dictionary is a subset of another.
○ Logic:Iterate through the first dictionary and check if its key-value pairs exist in the second dictionary.
○ Sample Input:SubsetDict:{"A":1,"B":2},SupersetDict:{"A":1,"B":2,"C":3}
○ Expected Output:Subset
 */

package dictionary;

import java.util.HashMap;
import java.util.Map;

public class Check_if_Dictionary_is_Subset_of_Another {
    public static void main(String[] args) {
        HashMap<String,Integer>subset_dict=new HashMap<>();
        subset_dict.put("A",1);
        subset_dict.put("B",2);

        HashMap<String,Integer>super_dict=new HashMap<>();
        super_dict.put("A",1);
        super_dict.put("B",2);
        super_dict.put("C",3);

        System.out.println(subset_dict);
        System.out.println(super_dict);

        for(Map.Entry<String,Integer>a:subset_dict.entrySet())
        {
            for(Map.Entry<String,Integer>b:super_dict.entrySet())
            {
                if(!super_dict.containsKey(a.getKey()) || super_dict.get(a.getKey()) != a.getValue())
                {
                    System.out.println("Subset");
                }
                else
                {
                    System.out.println("Not Subset");
                }
            }
        }
    }
}
