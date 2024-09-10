package queue;

import java.util.LinkedList;
import java.util.Queue;

public class implement {
    public static void main(String[] args) {
        Queue<Integer>a=new LinkedList<>();

        //enqueue
        a.add(10);
        a.add(5);
        a.add(15);
        a.offer(20);
        a.add(50);
        System.out.println("The enqueue elements are :- " + a);

        //dequeue
        a.poll();
        System.out.println("The dequeue elements are :- " + a);

        //peek
        a.peek();
        System.out.println("After performing peek operation : - " + a);

        //isEmpty
        boolean b=a.isEmpty();
        System.out.println("Status of a is :- " + b);


    }
}
