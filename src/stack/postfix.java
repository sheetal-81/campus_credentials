package stack;

import java.util.Scanner;
import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String num="23+56*1-1/69";
        Stack<Integer>a=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char c=num.charAt(i);
            if(Character.isDigit(c))
            {
                a.push(c-'0');
            }
            else
            {
                int one=a.pop();
                int two=a.pop();
                switch (c)
                {
                    case '+':
                        a.push(two+one);
                        break;

                    case '-':
                        a.push(two-one);
                        break;

                    case '*':
                        a.push(two*one);
                        break;

                    case '/':
                        a.push(two/one);
                        break;
                }
            }
        }
        System.out.println("The answer of postfix expression is " + a.pop());

    }
}
