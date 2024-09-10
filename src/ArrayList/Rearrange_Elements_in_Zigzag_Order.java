/*

○ Question: Write a function to rearrange elements in a list in zigzag order (a < b > c < d > e).
○ Logic: Use a loop to swap elements according to the zigzag pattern.
○ Sample Input: [4, 3, 7, 8, 6, 2, 1]
○ Expected Output: [3, 7, 4, 8, 2, 6, 1]

 */
package ArrayList;

public class Rearrange_Elements_in_Zigzag_Order {
    public static void main(String[] args) {
        int arr[]={4, 3, 7, 8, 6, 2, 1};
        boolean flag=true;
        int temp=0;
        for(int i=0;i< arr.length-1;i++)
        {
            if(flag)
            {
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else
            {
                if(arr[i]<arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            flag=!flag;

        }
        System.out.println("Rearranged elements in a list in zigzag order");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
