/*
○ Question:Write a function to sort a dictionary by key sort values in ascending orders in acending order.
○ Logic:Use the sorted()function with a custom key or use list comprehension.
○ Sample Input:{"C":3,"B":2,"A":1}
○ Expected Output(AscendingbyKey):{"A":1,"B":2,"C":3}
○ Expected Output(DescendingbyValue):{"C":3,"B":2,"A":1
 */
package dictionary;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class Sort_Dictionary_by_Key_or_Value {
    public static void main(String[] args)
    {
        HashMap<String,Integer>a=new HashMap<>();
       a.put("z",1);
       a.put("B",2);
       a.put("C",3);
        a.put("D",4);
        a.put("E",5);
        System.out.println(a);

        //Sorted array in ascending order
        Map<String,Integer>ans_asec=new TreeMap<>(a);
        System.out.println(ans_asec);


        //Sorted array in descending order
        for(String key:ans_asec.keySet())
        {
            System.out.println(key);
        }


    }
}
