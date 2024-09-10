/*
○ Question: Write a function to find the maximum sum of a subarray in a list.
○ Logic: Use Kadane's algorithm or a loop to calculate the maximum subarray sum.
○ Sample Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
○ Expected Output: 6

 */

package ArrayList;

public class Find_the_Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int size = arr.length;
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        System.out.println("THe maximum subarray sum is :- " + maxSoFar);
    }
}

