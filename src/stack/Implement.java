/*
Implement a Stack:
Create a Java class to implement a stack data structure with methods like push, pop, peek, and is_empty.
Use a list to simulate a stack and implement the methods accordingly
 */

package stack;

import java.util.Stack;

public class Implement {
    public static void main(String[] args) {
        Stack<Integer>a=new Stack<>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        a.push(60);
        System.out.println("\nThe added element in the stack are :-- " + a);


        a.pop();
        System.out.println("\nAfter removing element is :-- " + a);

        int c=a.peek();
        System.out.println("\nThe topmmost element is :-- " + a);

        boolean b=a.isEmpty();
        System.out.println("\nIs the list is empty ? :-- "+ b);


    }
}
