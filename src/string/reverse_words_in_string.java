/*

○ Question: Write a program to reverse the order of words in a string.
○ Logic: Split the string into words, reverse the order, and join them back together.
○ Sample Input: "Hello world"
○ Expected Output: "world Hello"

 */
package string;

import java.util.regex.Pattern;

public class reverse_words_in_string {
    public static void main(String[] args) {
        String a="Hello world";
        System.out.println("Before reversing the string is :-" + a);
        Pattern pat= Pattern.compile("\\s");
        String []b=pat.split(a);
        //System.out.println(b);
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<b.length;i++)
        {
            if(i==b.length-1)
            {
                ans.insert(i,b[i]);
            }
            else
            {
                ans.insert(0," "+ b[i]);
            }
        }
        System.out.println("The string after reverse is :- " + ans.toString());

    }
}
