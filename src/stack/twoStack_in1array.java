package stack;

import java.util.Stack;

public class twoStack_in1array {
    public static void main(String[] args) {
        int arr[]={5,4,6,7,8,1,10,30};
        Stack<Integer>a=new Stack<>();
        Stack<Integer>b=new Stack<>();
        for(int i=0;i<arr.length/2;i++)
        {
            a.push(arr[i]);
        }
        System.out.println();
        for(int j= arr.length/2;j< arr.length;j++)
        {
            b.push(arr[j]);
        }
        System.out.println("First stack is :- " + a);
        System.out.println("Second stack is :- " + b);

    }
}
