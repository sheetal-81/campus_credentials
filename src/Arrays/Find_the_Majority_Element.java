/*

Find the Majority Element:
○ Question: Find the majority element (element that appears more than n/2 times) in an array.
○ Logic: Use Moore's Voting Algorithm to find the majority element.
○ Sample Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
○ Expected Output: Majority Element: 4

 */

package Arrays;

public class Find_the_Majority_Element {
    public static void main(String[] args) {
        int arr[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majority=-1;
        for(int i=0;i< arr.length;i++)
        {
            int count=0;
            for(int j=0;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }

            }
            if(count> arr.length/2) {
                majority = arr[i];
                break;
            }
        }
        if(majority!=-1)
        {
            System.out.println("majority element is :- " + majority);
        }
        else
        {
            System.out.println("No element is found");
        }


    }
}
