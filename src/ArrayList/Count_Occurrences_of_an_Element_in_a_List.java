/*

○ Question: Write a function to count how many times a specific element appears in a list.
○ Logic: Use a loop to count occurrences.
○ Sample Input: [1, 2, 2, 3, 4, 2] and 2
○ Expected Output: 3

 */
package ArrayList;

public class Count_Occurrences_of_an_Element_in_a_List {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,2};
        int k=2;
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==k)
            {
                count++;
            }

        }
        System.out.println("The number of element is :- " + count);

    }
}
