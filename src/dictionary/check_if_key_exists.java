/*
○ Question:Write a function to check if a key exists in a dictionary.
○ Logic:Use the in operator or the get() method.
○ Sample Input:Dictionary:{"name":"Alice","age":30},Key:"age"
○ Expected Output:KeyExists
 */
package dictionary;

import java.util.HashMap;

public class check_if_key_exists {
    public static void main(String[] args) {
        HashMap<String,Integer>ans=new HashMap<>();
        ans.put("Alice",30);
        ans.put("name",20);
        ans.put("age",30);
        System.out.println(ans.containsKey("age"));
    }
}
