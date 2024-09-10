/*

○ Question: Write a function to calculate the mean (average) of a list of numbers.
○ Logic: Define a function that sums the numbers and divides by the count.
○ Sample Input: [2, 4, 6, 8, 10]
○ Expected Output: 6.0

 */
package function;

public class Calculate_the_Mean_of_Numbers_List {
    public static int mean_no(int arr[])
    {
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum/ arr.length;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int ans=mean_no(arr);
        System.out.println("The mean is :- " + ans);

    }
}
