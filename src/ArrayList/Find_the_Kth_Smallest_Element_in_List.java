/*

 Find the Kth Smallest Element in a List:
○ Question: Write a function to find the Kth smallest element in a list.
○ Logic: Use sorting or a selection algorithm to find the Kth smallest element.
○ Sample Input: List: [5, 2, 8, 3, 1, 9, 4], K: 3
○ Expected Output: 3

 */
package ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class Find_the_Kth_Smallest_Element_in_List {
    public static void main(String[] args) {
        int arr[]={5, 2, 8,3, 1, 9, 4};
        int k=3;
        Arrays.sort(arr);
        System.out.println("The sorted list is " + Arrays.toString(arr));
        System.out.println(arr[k-1]);



    }
}
