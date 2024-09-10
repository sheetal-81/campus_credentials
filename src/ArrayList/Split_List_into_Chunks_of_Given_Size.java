/*
○ Question: Write a function to split a list into smaller lists of a specified size.
○ Logic: Use list comprehensions or a loop to create chunks.
○ Sample Input: List: [1, 2, 3, 4, 5, 6, 7, 8], Chunk Size: 3
○ Expected Output: [[1, 2, 3], [4, 5, 6], [7, 8]]

 */
package ArrayList;

public class Split_List_into_Chunks_of_Given_Size {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int s=3;
        for (int i = 0; i < arr.length; i += s)
        {
            for (int j = 0; j < s && i + j < arr.length; j++)
            {
                System.out.print(arr[i + j] + " ");
            }
            System.out.println();
        }
    }
}
