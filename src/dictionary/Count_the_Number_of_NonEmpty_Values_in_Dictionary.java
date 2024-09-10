/*
 ○ Question:Write a function to count the number of non-empty (non-null) values in a dictionary.
 ○ Logic:Iterate through the dictionary and count values that are not empty.
 ○ Sample Input:{"A":1,"B":"","C":3,"D":None,"E":"Five"}
 ○ Expected Output:Number of Non-Empty Values:- 3

 */
package dictionary;
import java.util.HashMap;

public class Count_the_Number_of_NonEmpty_Values_in_Dictionary {
    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<>();
        a.put("A", "1");
        a.put("B", ""); // Empty value
        a.put("C", "3");
        a.put("D", null); // Null value
        a.put("E", "Five");

        int nonEmptyCount = 0;
        for (String value : a.values()) {
            if (value != null && !value.isEmpty()) {
                nonEmptyCount++;
            }
        }
        System.out.println("Number of Non-Empty Values: " + nonEmptyCount);
    }
}
