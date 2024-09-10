/*

○ Question: Write a function to calculate the sum of the digits of a given number.
○ Logic: Define a function that uses loops to extract and sum the digits of the number.
○ Sample Input: 12345
○ Expected Output: 15

 */


package function;
public class Calculate_the_Sum_of_Digits {
    public static double sum_digits(int arr[])
    {
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        double ans=sum_digits(arr);
        System.out.println("The sum of digits is :- " + (int)ans);
    }
}
