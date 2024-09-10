/*
○ Question: Write a program to check if a given string is a pangram (contains all letters of the alphabet).
○ Logic: Use loops to check if all letters are present.
○ Sample Input: "The quick brown fox jumps over the lazy dog."
○ Expected Output: Pangram

 */
package string;

import java.util.Locale;

public class check_for_pangram {
    public static void main(String[] args) {
        String a="The quick brown fox jumps over the lazy dog";
        for(char c='a';c<='z';c++)
        {
            if(!a.toLowerCase().contains(String.valueOf(c)))
            {
                System.out.println("Not pangram");
            }
        }
    }
}
