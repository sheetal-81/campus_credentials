/*
○ Question: Write a program to remove duplicate characters from a string.
○ Logic: Use a hash set or loops to track unique characters.
○ Sample Input: "programming"
○ Expected Output: "progamin"
 */
package string;
import java.util.*;
public class remove_duplicates_from_string {
    public static void main(String[] args) {
        String str="sheetalsheetal";
        System.out.println("String before removal of duplicate characters :- " + str);
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the character is already in the result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        System.out.println("String after removal of duplicates: " + result);


    }
}
