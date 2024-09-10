/*

Question: Write a function to add an element at the beginning of a list.
○ Logic: Use list slicing or the insert() method.
○ Sample Input: List: [2, 3, 4] and Element: 1
○ Expected Output: List: [1, 2, 3, 4]
 */
package ArrayList;

import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Add_an_Element_at_the_Beginning_of_a_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,4};
        int arr2[]=new int[arr.length+1];

        int add_element=1;
        arr2[0]=add_element;
        for(int i=0;i<arr.length;i++)
        {
            arr2[i+1]=arr[i];
        }
        System.out.println("The added element at the beginning is :- " + Arrays.toString(arr2));

    }
}
