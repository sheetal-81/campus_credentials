/*
ALGORITHM
[1] create two stack one for without sorted array(a) and one for with sorted value(b)
[2] now until the all values of a is gets empty run a loop
        where one by one pop the element and store in int temp
            now again apply one loop which will check b gets totally empty or value of temp is graeter than the last value of b
                then add the popped value of b in a
            or else add the value of temp in b
[3] apply one loop which will check only whether b is empty or not
        then add the value of popped element of b into a

[4] print the stack
 */


package stack;

import java.util.Stack;

public class sort_stack {
    public static void main(String[] args) {
        Stack<Integer>a=new Stack<>();
        Stack<Integer>b=new Stack<>();
        a.push(12);
        a.push(10);
        a.push(15);
        a.push(20);
        a.push(18);
        a.push(25);
        System.out.println("The original stack is :- " + a);
        while(!a.isEmpty())
        {
            int temp=a.pop();
            while(!b.isEmpty() && b.peek() < temp)
            {
                a.push(b.pop());
            }
            b.push(temp);

        }
        while(!b.isEmpty())
        {
            a.push(b.pop());
        }
        System.out.println("The sorted stack is :- " + a );

    }
}
