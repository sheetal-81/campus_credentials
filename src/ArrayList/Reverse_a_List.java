/*
○ Question: Write a function to reverse the order of elements in a list.
○ Logic: Use list slicing or a loop to reverse the elements.
○ Sample Input: [1, 2, 3, 4, 5]
○ Expected Output: [5, 4, 3, 2, 1]
 */
package ArrayList;

public class Reverse_a_List {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The reverse array is :- ");
        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
