//starting ka 15 hua he

/*

○ Question: Write a function to access values from a dictionary using keys.
○ Logic: Use square brackets or the get() method.
○ Sample Input: Dictionary: {"name": "Alice", "age": 30}, Key: "name"
○ Expected Output: "Alice"

 */
package dictionary;

import java.util.HashMap;
import java.util.Map;

public class Access_Dictionary_Values {
    public static void main(String[] args) {
        HashMap<String,Integer>a=new HashMap<>();
        a.put("Alice",30);
        a.put("john",60);
        a.put("bob",90);
        a.put("me",100);
        System.out.println("The list is :- " + a);

        System.out.println(a.get("Alice"));
        System.out.println(a.get(30));

        for (Map.Entry<String, Integer> e : a.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());



    }

}
