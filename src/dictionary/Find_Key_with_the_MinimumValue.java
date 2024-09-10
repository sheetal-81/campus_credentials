/*
○ Question:Write a function to find the key with the minimum value in a dictionary.
○ Logic:Iterate through the dictionary and keep track of the key with the minimum value.
○ Sample Input:{"X":20,"Y":10,"Z":30}
○ Expected Output:"Y"
 */

package dictionary;

import java.util.HashMap;

public class Find_Key_with_the_MinimumValue {
    public static void main(String[] args) {
        HashMap<String,Integer>a=new HashMap<>();
        a.put("X",20);
        a.put("Y",10);
        a.put("Z",30);

        System.out.println(a);

    }
}
