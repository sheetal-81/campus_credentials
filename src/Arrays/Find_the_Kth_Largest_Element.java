/*

Find the Kth Largest Element:
○ Question: Find the Kth largest element in an array.
○ Logic: Use techniques like quickselect or a max-heap to find the Kth largest element efficiently.
○ Sample Input: [3, 2, 1, 5, 6, 4], K = 2
○ Expected Output: 5

 */
package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Kth_Largest_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,2,1,5,6,4};
        int k=2;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Element at k position is :- " + arr[arr.length-k]);

    }
}
