/*

Question: Write a function to check if a list is sorted in non-decreasing order.
○ Logic: Use a loop to compare adjacent elements.
○ Sample Input: [1, 2, 3, 3, 4, 5]
○ Expected Output: Sorted

 */
package ArrayList;

import java.util.Scanner;

public class Check_Sorted_in_NonDecreasing_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                System.out.println("list is sorted in non-decreasing order");
                return;
            }

        }
        System.out.println("list is Unsorted in non-decreasing order ");
    }
}
