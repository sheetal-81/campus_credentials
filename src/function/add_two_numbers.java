/*

○ Question: Write a function that takes two numbers as input and returns their sum.
○ Logic: Define a function that takes two parameters and returns their sum.
○ Sample Input: 4 and 6
○ Expected Output: 10

 */

package function;

import java.util.Scanner;

public class add_two_numbers {
    public static int calculate_Sum(int a,int b)
    {
        return a+b;

    }
    public static void main(String[] args) {
        int sum=calculate_Sum(4,6);
        System.out.println("The sum is :- " + sum);
    }
}
