/*

○ Question: Write a function to merge two sorted lists into a single sorted list.
○ Logic: Use two pointers to iterate through the lists and merge them.
○ Sample Input: [1, 3, 5] and [2, 4, 6]
○ Expected Output: [1, 2, 3, 4, 5, 6]

 */
package ArrayList;

public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        int arr1[]={1,3,5};
        int arr2[]={2,4,6};
        int merge[]=new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while(i< arr1.length && j< arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                merge[k++]=arr1[i++];
            }
            else
            {
                merge[k++]=arr2[j++];
            }
        }
        while(i< arr1.length)
        {
            merge[k++]=arr1[i++];
        }
        while(j< arr2.length)
        {
            merge[k++]= arr2[j++];
        }
        System.out.print("Merged two sorted list are :- ");
        for(i=0;i< merge.length;i++)
        {
            System.out.print(merge[i] + " ");
        }
    }
}
