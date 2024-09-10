/*
○ Question: Write a function to remove all occurrences of a specific element from a list.
○ Logic: Use list comprehensions or a loop to filter out the element.
○ Sample Input: List: [1, 2, 2, 3, 4, 2] and Element: 2
○ Expected Output: List: [1, 3, 4]

 */
package ArrayList;

public class Remove_All_Occurrences_of_an_Element_in_List {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,2};
        int element=2;
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=element)
            {
                count++;
            }
        }
        int index=0;
        int newArr[]=new int[count];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=element)
            {
                newArr[index]=arr[i];
                index++;
            }
        }
        System.out.print("The list after removing all occurrences of a specific element from a list :- ");
        for(int i=0;i< newArr.length;i++)
        {
            System.out.print(newArr[i] + " ");
        }
    }
}
