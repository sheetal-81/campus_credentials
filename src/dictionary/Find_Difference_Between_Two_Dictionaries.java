/*
 ○ Question:Write a function to find the difference between two dictionaries(key-value pairs that exist in one but not in the other).
 ○ Logic:Iterate through one dictionary and check if the keys exist in the other dictionary.
 ○ Sample Input:Dict1:{"A":1,"B":2,"C":3},Dict2:{"B":2,"C":4,"D":5}
 ○ Expected Output:{"A":1}
 */
package dictionary;

import java.util.*;

public class Find_Difference_Between_Two_Dictionaries {
    public static void main(String[] args) {
        HashMap<String,Integer>a=new HashMap<>();
        HashMap<String,Integer>b=new HashMap<>();
        a.put("A",1);
        a.put("B",2);
        a.put("C",3);
        System.out.println("The first dictionary is :- " +a);

        b.put("B",2);
        b.put("C",4);
        b.put("D",5);
        System.out.println("The second dictionary is :- " +b);


        HashMap<String,Integer>diff=new HashMap<>();
        for(Map.Entry<String,Integer>entry:a.entrySet())
        {
            String key= entry.getKey();
            Integer value= entry.getValue();

            if(!b.containsKey(key) || !b.get(key).equals(value))
            {
                diff.put(key,value);
            }
        }
        System.out.println(diff);



    }
}
