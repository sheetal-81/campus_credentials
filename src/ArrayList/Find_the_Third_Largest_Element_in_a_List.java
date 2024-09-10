/*

○ Question: Write a function to find the third largest element in a list.
○ Logic: Iterate through the list while keeping track of the largest, second largest, and third largest elements.
○ Sample Input: [5, 9, 2, 7, 3, 8, 6]
○ Expected Output: 7

 */
package ArrayList;
import java.util.*;
public class Find_the_Third_Largest_Element_in_a_List {
    public static void main(String[] args) {
        int arr[]={5, 9, 2, 7, 3, 8, 6};
        Arrays.sort(arr);
        System.out.println("Arrays after sorting :- " + Arrays.toString(arr));
        System.out.println("The third largest element is :- " + arr[arr.length-3]);
    }
}
