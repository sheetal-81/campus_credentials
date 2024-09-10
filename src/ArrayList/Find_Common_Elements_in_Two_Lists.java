/*

○ Question: Write a function to find common elements between two lists.
○ Logic: Use list comprehensions or a loop to compare elements.
○ Sample Input: [1, 2, 3, 4] and [3, 4, 5, 6]
○ Expected Output: [3, 4]

 */
package ArrayList;

public class Find_Common_Elements_in_Two_Lists {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6,2};
        System.out.println("\nThe common elements are :- " );
        for(int i=0;i< arr1.length;i++)
        {
            for(int j=0;j< arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i] + " ");
                }

            }
        }


    }
}
