/*

○ Question:Write a function to count the number of key-value pairs in a dictionary.
○ Logic:Use the len() function to count the number of items in the dictionary.
○ Sample Input:{"A":1,"B":2,"C":3}
○ Expected Output:Number of Key-ValuePairs:3

 */


package dictionary;

import java.util.HashMap;

public class Count_the_Number_of_KeyValue_Pairs {
    public static void main(String[] args) {
        HashMap<String,Integer>a=new HashMap<>();
        a.put("A",1);
        a.put("B",2);
        a.put("C",3);
        System.out.println("Number of key-value is :- " + a.size());

    }
}
