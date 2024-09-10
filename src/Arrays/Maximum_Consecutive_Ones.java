/*

Question: Find the maximum number of consecutive 1s in a binary array.
○ Logic: Iterate through the array, keeping track of the current consecutive 1s and the maximum seen so far.
○ Sample Input: [1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1]
○ Expected Output: 4

 */
package Arrays;

import java.util.Scanner;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int count=0;
        int maxCount=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                maxCount=Math.max(maxCount,count);

            }
            else
            {
                count=0;
            }
        }
        System.out.println("Maximum consecutive ones is :- " + maxCount);
    }
}
