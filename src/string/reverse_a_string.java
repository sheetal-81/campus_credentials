/*

○ Question: Write a function to reverse a given string.
○ Logic: Define a function to reverse the characters in the string.
○ Sample Input: "hello"
○ Expected Output: "olleh"

 */

package string;

public class reverse_a_string {
    public static void main(String[] args) {
        String a="hello";
        System.out.println("String before reverse :- " + a);
        System.out.print("String after traversal :- ");
        String b[]=a.split("\\s+");
        for(String c:b)
        {
            StringBuilder d=new StringBuilder(c);
            d.reverse();
            System.out.print(d);
        }
    }
}
