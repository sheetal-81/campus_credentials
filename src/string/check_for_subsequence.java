/*

○ Question: Write a program to check if one string is a subsequence of another.
○ Logic: Use loops to check if the characters of the subsequence are in the same order.
○ Sample Input: "abc" and "ahbgdc"
○ Expected Output: Subsequence

 */
package string;

public class check_for_subsequence {
    public static void main(String[] args) {
        String a="abc";
        String b="ahbgdc";
        int index_a=0;
        int index_b=0;
        while(index_a<a.length() && index_b<b.length())
        {
            if(a.charAt(index_a)==b.charAt(index_b))
            {
                index_a++;
            }
            index_b++;
        }
        if(a.length()==index_a)
        {
            System.out.println("subsequence");
        }
        else
        {
            System.out.println("Not subsequence");
        }
    }
}
