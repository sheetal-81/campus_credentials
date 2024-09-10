/*
○ Question: Write a program to check if two strings are anagrams of each other.
○ Logic: Check if the character counts in both strings are the same.
○ Sample Input: "listen" and "silent"
○ Expected Output: Anagrams

 */
package string;

import java.util.Arrays;

public class check_for_anagram {
    public static void main(String[] args) {

        //create the string
        String a="listen";
        String b="silnt";

        //remove the white spaces and convert to lowercase
        a=a.replaceAll("\\s"," ").toLowerCase();
        b=b.replaceAll("\\s"," ").toLowerCase();

        //check if length are different
        if(a.length()!=b.length())
        {
            System.out.println("It is not anagram ,First of all. Go and correct the length ");
            return;
        }

        //convert the string to char array
        char[] char_a=a.toCharArray();
        char[] char_b=b.toCharArray();

        //sort the charArray
        Arrays.sort(char_a);
        Arrays.sort(char_b);

        //check if sorted char arrays are equal
        if(Arrays.equals(char_a,char_b))
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("Not anagram");
        }


    }
}
