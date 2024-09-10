/*
○ Question: Write a program to check if a given string is a palindrome.
○ Logic: Use loops to compare characters from the start and end of the string.
○ Sample Input: "racecar"
○ Expected Output: Palindrome

 */
package string;

public class check_for_palindrome {
    public static void main(String[] args) {
        String a="racecar";
        int i=0;
        int j=a.length()-1;
        while(i<j)
        {
            if(a.charAt(i)!=a.charAt(j))
            {
                System.out.println("Not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("PALINDROME");
    }
}
