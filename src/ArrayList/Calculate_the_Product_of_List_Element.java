/*

○ Question: Write a function to calculate the product of all elements in a list.
○ Logic: Use a loop to iterate through the list and accumulate the product.
○ Sample Input: [2, 3, 4, 5]
○ Expected Output: 120

 */
package ArrayList;

import java.util.Scanner;

public class Calculate_the_Product_of_List_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,4,5};
        int prod=1;
        for(int i=0;i< arr.length;i++)
        {
            prod=prod*arr[i];
        }
        System.out.println("The product of element is :- " + prod);
    }
}
