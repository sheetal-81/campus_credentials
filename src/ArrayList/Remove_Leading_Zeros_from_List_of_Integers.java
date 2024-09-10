/*

○ Question: Write a function to remove leading zeros from a list of integers.
○ Logic: Use list slicing or a loop to remove zeros until a non-zero element is encountered.
○ Sample Input: [0, 0, 1, 2, 0, 3, 0, 0, 4]
○ Expected Output: [1, 2, 0, 3, 0, 0, 4]


 */
package ArrayList;

public class Remove_Leading_Zeros_from_List_of_Integers {
    public static void main(String[] args) {
        int arr[]={0, 0, 1, 2, 0, 3, 0, 0, 4};
        int start=0;
        for(int i=0;i< arr.length;i++) {
            if (arr[i] != 0) {
                start = i;
                break;
            }
        }
        System.out.println("After removing leading zeros from a list of integers :- ");
        for(int i=start;i< arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }


    }
}
