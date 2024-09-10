/*

○ Question:Write a function to reverse a given string.
○ Logic:Define a function to reverse the characters in the string.
○ Sample Input:"hello"
○ Expected Output:"olleh"

 */

package function;
public class reverse_string {
    //Function
    public static void main(String[] args) {
        String arr="hello";
        System.out.println("Original String :- " +arr);
        System.out.print("Reversed String :- ");
        for(int j= arr.length()-1;j>=0;j--)
        {
            System.out.print(arr.charAt(j) + " ");
        }

    }

}
