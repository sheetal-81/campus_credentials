/*
○ Question: Write a program to count the number of words in a string.
○ Logic: Use loops to count spaces and words.
○ Sample Input: "This is a sentence."
○ Expected Output: 4

 */
package string;

public class count_words_in_string {
    public static void main(String[] args) {
        String str="This is a sentence,and i am fine";
        System.out.println(str);
        int count_word=str.split("[\\s,]+").length;
        System.out.println("The count of word in a sentence is :- " + count_word);
    }
}
