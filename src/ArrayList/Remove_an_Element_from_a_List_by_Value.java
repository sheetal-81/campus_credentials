/*
Question: Write a function to remove a specific element from a list by its value.
○ Logic: Use list methods like remove() or list comprehensions.
○ Sample Input: List: [1, 2, 3, 4, 5] and Element: 3
○ Expected Output: List: [1, 2, 4, 5]

 */
package ArrayList;

public class Remove_an_Element_from_a_List_by_Value {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=k)
            {
                count++;
            }
        }
        int newArr[]=new int[count];
        int index=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=k)
            {
                newArr[index]=arr[i];
                index++;
            }
        }
        System.out.println("The list after an element is removed by value is :- ");
        for(int i=0;i< newArr.length;i++)
        {
            System.out.print(newArr[i]+ " ");
        }

    }
}
