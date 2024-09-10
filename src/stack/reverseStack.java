package stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer>a=new Stack<>();
        Stack<Integer>b=new Stack<>();
        a.push(2);
        a.push(1);
        a.push(5);
        a.push(8);
        a.push(7);
        System.out.println("Stack without reversing :- " + a);

        while(!a.isEmpty())
        {
            int temp=a.pop();
            b.push(temp);
        }
        System.out.println("Stack after reversing :- "+ b);

    }
}
