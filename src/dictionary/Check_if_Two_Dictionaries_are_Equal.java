/*

 ○ Question:Write a function to check if two dictionaries are equal (have the same key-value pairs).
 ○ Logic:Iterate through both dictionaries and compare key-value pairs.
 ○ Sample Input:Dict1:{"A":1,"B":2,"C":3},Dict2:{"C":3,"B":2,"A":1}
 ○ Expected Output:Equal
 */
package dictionary;

import java.util.HashMap;

public class Check_if_Two_Dictionaries_are_Equal {
    public static void main(String[] args) {
        HashMap<String,Integer>dict1=new HashMap<>();
        HashMap<String,Integer>dict2=new HashMap<>();
        dict1.put("A",1);
        dict1.put("B",2);
        dict1.put("C",3);
        System.out.println(dict1);

        dict2.put("C",3);
        dict2.put("B",2);
        dict2.put("A",1);
        System.out.println(dict2);

        System.out.println(dict1.containsKey(dict2));

        if(dict1.equals(dict2))
        {
            System.out.println("yes ! It is equal");
        }
        else
        {
            System.out.println("No ! It is not equal");
        }


    }
}
