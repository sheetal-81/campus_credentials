/*
○ Question: Write a function to remove duplicate elements from a list.
○ Logic: Use a loop or convert the list to a set and back to a list.
○ Sample Input: [1, 2, 2, 3, 4, 4, 5]
○ Expected Output: [1, 2, 3, 4, 5]

 */
package ArrayList;

public class Remove_Duplicates_from_a_List {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,6,6};
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length-1]);
    }
}
