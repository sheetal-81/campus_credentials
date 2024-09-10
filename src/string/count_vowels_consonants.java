/*
○ Question: Write a program to count the number of vowels and consonants in a given string.
○ Logic: Use loops and conditional statements to categorize characters.
○ Sample Input: "hello"
○ Expected Output: Vowels: 2, Consonants: 3

 */
package string;

public class count_vowels_consonants {
    public static void main(String[] args) {
        String str="hello";
        int vow_count=0;
        int cons_count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if("aeiouAEIOU".contains(String.valueOf(ch)))
            {
                vow_count++;
            }
            else
            {
                cons_count++;
            }
        }
        System.out.println("The count of vowel is :- " + vow_count);
        System.out.println("The count of consonanat is :- " + cons_count);
    }
}
