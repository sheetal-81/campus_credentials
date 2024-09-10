/*

 Question: Write a function to reverse each word in a string.
 ○ Logic:Define a function that splits the string in towords,reverses each word,and joins them back together.
 ○ Sample Input:"Hello world"
 ○ Expected Output:"olleH dlrow"

 */


package function;
import java.util.*;
public class Reverse_Each_Word_in_String {
    public static void main(String[] args) {
        String arr="Hello world , My name is sheetal";
        String word[]=arr.split(" ");
        StringBuilder ans=new StringBuilder();
        //System.out.println(word);
        System.out.println("original string :- " + arr);
        System.out.print("Reversed array is :- ");
        for(String a:word)
        {
            StringBuilder b=new StringBuilder(a);
            b.reverse();
            ans.append(b).append(" ");
        }
        System.out.println(ans.toString().trim());




    }
}
