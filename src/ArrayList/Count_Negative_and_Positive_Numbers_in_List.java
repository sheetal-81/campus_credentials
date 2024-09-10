/*

Question: Write a function to count the number of negative and positive numbers in a list.
○ Logic: Use a loop to iterate through the list and keep two counters.
○ Sample Input: [3, -2, 7, -1, 0, 5, -4]
○ Expected Output: Positive: 4, Negative: 3

 */
package ArrayList;

public class Count_Negative_and_Positive_Numbers_in_List {
    public static void main(String[] args) {
        int arr[]={3, -2, 7, -1, 0, 5, -4,-10,100,0,-100};
        int count1=0;   // for negative numbers
        int count2=0;   // for positive numbers
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>=0)
            {
                count1++;
            }
            if(arr[i]<0)
            {
                count2++;
            }
        }
        System.out.println("The number of positive element is :-  " + count1);
        System.out.println("The number of negative element is :-  " + count2);


    }
}
