/*
ALGORITHM
{1} Sort the array
{2} Create a new array to hold the unique elements
{3) Initialize the first element of temp array with the first element of the sorted array
{4} Initialize count of unique elements
{5} Iterate over the sorted array
{6} If the current element is not equal to the previous element, add it to the temp array
{7} copy the unique elements to a new array
{8} Print the array without duplicates

 */
package Arrays;

import java.util.*;
import java.util.Scanner;

public class Remove_Duplicates_from_Unsorted_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={7,32,3,1,2,8,3,1,2,4};
        Arrays.sort(arr);
        int temp[]=new int[arr.length];
        temp[0]=arr[0];
        int count=1;
        for(int i=1;i< arr.length;i++) {
            if (arr[i] != arr[i - 1]) {
                temp[count++] = arr[i];
            }
        }
        int []uniArr=Arrays.copyOf(temp,count);
        System.out.println(Arrays.toString(uniArr));

    }
}
