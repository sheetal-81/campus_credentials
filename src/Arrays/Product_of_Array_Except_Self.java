/*

Question: Given an array, return an array where each element is the product of all the elements in the array except itself.
○ Logic: Use two passes, one from left to right, and one from right to left, to calculate products.
○ Sample Input: [1, 2, 3, 4]
○ Expected Output: [24, 12, 8, 6]

 */

package Arrays;

import java.util.Scanner;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4};
        int prod[]=new int[arr.length];
        for(int i=0;i< arr.length;i++) {
            prod[i]=1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    prod[i] = prod[i] * arr[j];

                }
            }
            System.out.print(prod[i] + " ");
        }


    }
}
