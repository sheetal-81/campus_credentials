/*

○ Question: Write a program to reverse each word in a string.
○ Logic: Split the string into words, reverse each word, and join them back together.
○ Sample Input: "Hello world"
○ Expected Output: "olleH dlrow"

 */
package string;

public class reverse_each_word_in_string {
    public static void main(String[] args) {
        String str="Hello world";
        System.out.println("The string before reversing each word :- " + str);
        String a[]=str.split("\\s+");
        for(String word:a)
        {
            StringBuilder rev_word=new StringBuilder(word);
            rev_word.reverse();
            System.out.print(rev_word + " ");

        }
    }
}
