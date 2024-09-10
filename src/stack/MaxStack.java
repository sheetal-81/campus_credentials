package stack;

import java.util.Stack;

public class MaxStack {
    public static void main(String[] args) {
        Stack<Integer>a=new Stack<>();
        a.push(15);
        a.push(12);
        a.push(18);
        a.push(80);
        a.push(30);
        a.push(22);
        System.out.println("The pushed element in the stack is :-" + a);

        a.peek();
        System.out.println("The peeked element from stack is " + a);

        a.pop();
        System.out.println("The popped element from stack is :- " + a);

        int max=a.get(0);
        for(Integer i:a)
        {
            if(i>max)
                max=i;
        }

        System.out.println("Max element: " + max);



    }
}

