/*

Find the Intersection of Three Arrays:
○ Question: Find the common elements in three arrays.
○ Logic: Use three sets to keep track of common elements between the arrays.
○ Sample Input: [1, 2, 3], [2, 3, 4], [3, 4, 5]
○ Expected Output: [3]

 */

package Arrays;

import java.util.Scanner;

public class Find_the_Intersection_of_Three_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={1,2};
        int arr2[]={2,3,4};
        int arr3[]={3,4,7};
        for(int i=0;i< arr1.length;i++)
        {
            for(int j=0;j< arr2.length;j++)
            {
                for(int k=0;k< arr3.length;k++)
                {
                    if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
                    {
                        System.out.println("The intersection between the three arrays are :- " + arr2[j]);
                    }
                }
            }

        }
        System.out.println("Do Not have any intersection ");

    }
}
