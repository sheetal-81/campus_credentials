/*

 Question: Write a function to count the number of occurrences of a substring in a given string.
○ Logic: Define a function that uses loops to search for the substring and count occurrences.
○ Sample Input: "abababab" and "ab"
○ Expected Output: 4

 */
package string;

public class count_substring_in_string {
    public static void main(String[] args) {
        String main="abababab";
        String sub="abc";
        int count=0;
        for(int i=0;i<=main.length()-sub.length();i++)
        {
            if(main.substring(i,i+sub.length()).equals(sub))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
