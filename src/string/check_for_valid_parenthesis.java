/*

○ Question: Write a program to check if a string containing parentheses is valid.
○ Logic: Use a stack to keep track of open and close parentheses.
○ Sample Input: "({[()]})"
○ Expected Output: Valid

 */
package string;

public class check_for_valid_parenthesis {
    public static void main(String[] args) {
        String a="({[()]})";
        String b=a;
        while(b.contains("()")|| b.contains("[]") ||b.contains("{}")) {
            b = a.replace("()", " ");
            b = a.replace("[]", " ");
            b = a.replace("{}", " ");

        }
        if(b.isEmpty())
            System.out.println("valid parenthesis");

        else
            System.out.println("Not");
    }
}
