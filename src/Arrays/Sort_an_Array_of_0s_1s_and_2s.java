/*

○ Question: Given an array with only 0s, 1s, and 2s, sort the array in a single pass without using extra space.
○ Logic: Use a modified Dutch National Flag algorithm.
○ Sample Input: [1, 0, 2, 1, 0, 2]
○ Expected Output: [0, 0, 1, 1, 2, 2]

 */

// Its is technically correct but questionally wrong (so you can follow dutch national ka pehla wala)
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_an_Array_of_0s_1s_and_2s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={0, 1, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
