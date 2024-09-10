/*

○ Question: Write a program to find the first non-repeating character in a string.
○ Logic: Use loops to count characters and find the first non-repeating character.
○ Sample Input: "leetcode"

○ Expected Output: "l"

 */
package string;

public class find_first_nonRepeating_character {
    public static void main(String[] args) {
        String a="leetcode";
        System.out.println(a);
        char not=' ';
        int result[]=new int[256];
        for(char ch:a.toCharArray())
        {
            result[ch]++;
        }
        for(char ch:a.toCharArray())
        {
            if(result[ch]==1)
            {
                not=ch;
                break;
            }
        }
        System.out.println(not);
    }
}
