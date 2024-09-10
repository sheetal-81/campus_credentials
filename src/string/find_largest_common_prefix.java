/*
○ Question: Write a program to find the longest common prefix among an array of strings.
○ Logic: Compare characters of all strings from left to right.
○ Sample Input: ["flower", "flour", "flight"]
○ Expected Output: "fl"

 */
package string;

public class find_largest_common_prefix {
    public static void main(String[] args) {
        String str[]={"flower","flour","flight"};
        int minLength = Integer.MAX_VALUE;
        for (String s : str) {
            minLength = Math.min(minLength, s.length());
        }

        // Compare characters from left to right
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char currentChar = str[0].charAt(i); // Take the first string as reference
            for (String s : str) {
                if (s.charAt(i) != currentChar) {
                    System.out.println("The longest common prefix is: " + prefix.toString());
                    return;
                }
            }
            prefix.append(currentChar); // Append the matching character
        }

        System.out.println("The longest common prefix is: " + prefix.toString());


    }
}
