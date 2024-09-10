/*
○ Question:Write a program to check if a string containing parentheses is valid.
○ Logic:Use a stack to keep track of open and close parentheses.
○ Sample Input:"({[()]})"
○ Expected Output:Valid
 */
package function;

public class Check_for_Valid_Parentheses {
    public static String val_par(String a)
    {
        for(int i=0;i<a.length();i++)
        {
            for(int j=a.length()-1;j<0;j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    System.out.println("valid");
                }
            }
        }
        return "not valid";
    }
    public static void main(String[] args) {
        String a="({[()]})";
        String ans=val_par(a);
        System.out.println("The valid parenthesis is :- " + ans);

    }
}
