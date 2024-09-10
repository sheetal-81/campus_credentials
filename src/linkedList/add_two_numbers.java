/*
 Implementa Singly LinkedList:
 ○ Create a Java class to represent a singly linkedlist with methods like
 insert_at_head, insert_at_tail,delete,and search.
 ○ Implement the methods to manipulate the linkedlist accordingly.
 */
package linkedList;
import java.util.*;
import java.util.LinkedList;

public class add_two_numbers {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();

        //Insert at Head
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(8);
        System.out.println("After adding element at the first is :- "+list);

        //Inert at tail
        list.addLast(1);
        list.addLast(10);
        list.addLast(20);
        System.out.println("After adding element at the end is :- "+list);

        //delete
        list.remove(Integer.valueOf(8));
        System.out.println("After deletion list become :-"+list);

        list.contains(5);
        System.out.println("Now the list is :- " +list);

        System.out.println("After all operation list becomes :- " +list);
    }




}
