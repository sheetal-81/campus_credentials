/*

○ Question: Write a program to compress a string by replacing consecutive characters with their counts.
○ Logic: Use loops to count consecutive characters and create the compressed string.
○ Sample Input: "aaabbbcccc"
○ Expected Output: "a3b3c4"

 */

/*
Algorithm
Iterate through the string.
Track the current character and its count of repetitions.
Append the character and its count to a StringBuilder when a new character is encountered.
Convert the StringBuilder to a string and return it.
 */
package string;

public class compress_a_string {
    public static void main(String[] args) {
        String a="aaabbbcccc";
        System.out.println(" The original string is :- " + a);
        if(a==null || a.length()==0)
        {
            System.out.println("since length is less :- " + a);
            return;
        }
        StringBuilder compress=new StringBuilder();
        int count=1;
        char prevChar=a.charAt(0);
        for(int i=1;i<a.length();i++)
        {
            char currChar=a.charAt(i);
            if(currChar==prevChar)
            {
                count++;
            }
            else
            {
                compress.append(prevChar).append(count);
                prevChar=currChar;
                count=1;
            }
        }
        compress.append(prevChar).append(count);
        String ans=compress.toString();
        System.out.println("The final answer is :- " + ans);


    }
}
