/*

Question: Given an array, move all the zeros to the end without changing the order of non-zero elements.
○ Logic: Iterate through the array, moving non-zero elements to the front and filling the remaining space with zeros.
○ Sample Input: [0, 1, 0, 3, 12]
○ Expected Output: [1, 3, 12, 0, 0]

 */
package Arrays;

import java.util.Scanner;

public class Move_Zeros_to_the_End {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={0, 1, 0, 3, 12};
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while(count< arr.length)
        {
            arr[count++]=0;
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
