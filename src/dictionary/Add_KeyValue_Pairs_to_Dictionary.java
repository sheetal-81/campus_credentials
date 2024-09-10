/*
○ Question: Write a function to add key-value pairs to a dictionary.
○ Logic: Use square brackets or the update() method.
○ Sample Input: Dictionary: {"name": "Alice"}, Key: "age", Value: 30
○ Expected Output: Dictionary: {"name": "Alice", "age": 30}
 */
package dictionary;

import java.util.HashMap;

public class Add_KeyValue_Pairs_to_Dictionary {
    public static void main(String[] args) {
        System.out.println("access key value pair");
        HashMap<String,Integer>a=new HashMap<>();
        a.put("sheetal",36);
        a.put("shashi",5);
        System.out.println(a);
        a.put("Alice",30);
        a.put("age",20);
        System.out.println("Dictionary : " + a);

    }
}
