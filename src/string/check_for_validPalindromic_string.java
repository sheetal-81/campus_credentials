/*
○ Question: Write a function to check if a given string is a valid palindromic string after ignoring non-alphanumeric characters and considering case.
○ Logic: Define a function that uses loops to compare characters while ignoring non-alphanumeric characters.
○ Sample Input: "A man, a plan, a canal: Panama"
○ Expected Output: Valid Palindrome

 */
package string;

public class check_for_validPalindromic_string {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(s);
        String c=s.replaceAll("[a-zA-Z0-9]"," ").toLowerCase();
        System.out.println(c);
        System.out.println(c.length());
        int left=0;
        int right=c.length()-1;
        while(left<right) {
            if (c.charAt(left) != c.charAt(right)) {
                System.out.println("valid palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Not a Valid palindrome");

    }
}
