/*

○ Question: Write a function to find the second largest element in a list.
○ Logic: Iterate through the list and keep track of the largest and second largest elements.
○ Sample Input: [3, 8, 1, 10, 5]
○ Expected Output: 8

 */
package ArrayList;
import java.util.*;
public class Find_the_Second_Largest_Element_in_a_List {
    public static void main(String[] args) {
        int arr[]={3,8,1,10,5};
        Arrays.sort(arr);
        System.out.println("Arrays after sorting :- " +Arrays.toString(arr));
        System.out.println("The second largest element is :- " + arr[arr.length-2]);
    }
}
