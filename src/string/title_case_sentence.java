/*

○ Question: Write a program to convert the first letter of each word to uppercase in a sentence.
○ Logic: Split the sentence into words and capitalize the first letter of each word.
○ Sample Input: "this is a test"
○ Expected Output: "This Is A Test"

 */

package string;
import java.util.*;
public class title_case_sentence {
    public static void main(String[] args) {
        String a="this is a test";
        System.out.println(a);
        //System.out.println(Character.toUpperCase(a.charAt(0)) + a.substring(1));
        String[]b=a.split("\\s");
        StringBuilder c=new StringBuilder();
        for(String ans:b)
        {
            c.append(Character.toTitleCase(ans.charAt(0)))
                    .append(ans.substring(1))
                    .append(" ");
        }
        System.out.println(c.toString().trim());
    }
}
