/*
Question: Write a function to find all the elements that appear more than once in a list.
○ Logic: Use a loop and a dictionary to count occurrences.
○ Sample Input: [4, 3, 2, 7, 8, 2, 1, 5, 5]
○ Expected Output: [2, 5]
 */
package ArrayList;

import java.util.Arrays;

public class Find_All_Duplicates_in_List {
    public static void main(String[] args) {
        int arr[]={4, 3, 2, 7, 8, 2, 1, 5, 5, 1};
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.print("The elements that appear more than once in a list :- ");
        for(int i=0;i< arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.print(arr[i] + " ");
            }
            //System.out.println(arr[i]);

        }

    }
}
