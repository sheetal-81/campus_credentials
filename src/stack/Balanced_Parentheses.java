package stack;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the parenthesis");
        String a=sc.nextLine();
        Stack<Character>b=new Stack<>();
        char[]charArray=a.toCharArray();
        for(char current:charArray) {
            if (current == '(' || current == '{' || current == '[') {
                b.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                if (b.isEmpty()) {
                    System.out.println("KUCH VALUE TO DAAL");
                }

                char top = b.pop();
                if ((current == ')' && top != '(' || current == '}' && top != '{' || current == ']' && top != '[')) {
                    System.out.println("Not balanced");
                    return;
                }
            }
        }
        if(b.isEmpty())
        {
            System.out.println("It is not balance parenthesis");
        }
        else
        {
            System.out.println("It is not balanced");
        }

    }
}
