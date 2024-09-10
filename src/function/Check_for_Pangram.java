/*

○ Question: Write a function to check if a given string is a pangram (contains all letters of the alphabet).
○ Logic: Define a function that uses loops to check if all letters are present.
○ Sample Input: "The quick brown fox jumps over the lazy dog."
○ Expected Output: Pangram

 */
package function;

public class Check_for_Pangram {
    public static String  pangram(String a)
    {
        for(char c='a';c<='z';c++)
        {
            if(!a.toLowerCase().contains(String.valueOf(c)))
            {
                return "Not pangram";
            }

        }
        return "pangram";

    }
    public static void main(String[] args) {
        String a="The quick brown fox jumps over the lazy dog";
        System.out.println("The answer is :- " + (pangram(a)));

    }
}
