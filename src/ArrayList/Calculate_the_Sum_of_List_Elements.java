/*
○ Question: Write a function to calculate the sum of all elements in a list.
○ Logic: Use a loop to iterate through the list and accumulate the sum.
○ Sample Input: [1, 2, 3, 4, 5]
○ Expected Output: 15

 */
package ArrayList;

public class Calculate_the_Sum_of_List_Elements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("The sum of all list elements is :- " + sum);
    }
}
