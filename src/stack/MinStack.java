package stack;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        Stack<Integer>a=new Stack<>();
        a.push(11);
        a.push(10);
        a.push(5);
        a.push(15);
        a.push(20);
        System.out.println("The pushed values are :- " + a);

        a.pop();
        System.out.println("The popped values are :- " + a);

        a.peek();
        System.out.println("The peek values are :- " + a);

        int min=a.get(0);
        for(Integer i:a)
        {
            if(min>i)
            {
                min=i;
            }
        }
        System.out.println("The minimum element is :- " + min);

    }
}
