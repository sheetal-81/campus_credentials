/*

○ Question: Write a function to find the largest element in a list.
○ Logic: Iterate through the list and keep track of the maximum element.
○ Sample Input: [3, 8, 1, 10, 5]
○ Expected Output: 10

 */
package ArrayList;
import java.util.*;
public class Find_the_Maximum_Element_in_a_List {
    public static void main(String[] args) {
        int arr[]={3,8,1,10,5};
        Arrays.sort(arr);
        System.out.println("list after array is sorted :- " +Arrays.toString(arr));
        System.out.println("The maximum element in the list is :- " + arr[arr.length-1]);
    }
}
