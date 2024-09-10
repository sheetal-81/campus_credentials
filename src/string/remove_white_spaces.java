/*
○ Question: Write a program to remove white spaces from a string.
○ Logic: Use loops to remove spaces or use a regular expression.
○ Sample Input: "hello world"
○ Expected Output: "helloworld"
 */
package string;

public class remove_white_spaces {
    public static void main(String[] args) {
        String str="hello world";
        System.out.println("The string before removal of whitespace :- " + str);
        String v=str.replace(" ","");
        System.out.println("The string after removal of whitespaces :- " + v);
        // or
        System.out.println(str.replaceAll("\\s",""));

    }
}
