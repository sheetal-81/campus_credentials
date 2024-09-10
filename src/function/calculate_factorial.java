/*

○ Question: Write a function to calculate the factorial of a given number.
○ Logic: Define a recursive function to calculate the factorial of a number.
○ Sample Input: 5
○ Expected Output: 120

 */

package function;

public class calculate_factorial {
    public static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;

        }
        else
        {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int num=5;
        int ans=factorial(num);
        System.out.println("The answer for factorial is :- " + ans);

    }
}

