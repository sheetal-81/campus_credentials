/*
 ○ Question:Write a function to check if a given number is prime.
 ○ Logic:Define a function that checks if the number is divisible by any numbers from 2 to its square root.
 ○ Sample Input: 11
 ○ Expected Output: Prime
 */
package function;

import java.util.Scanner;

public class check_for_prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num=sc.nextInt();
        if(is_prime(num))
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime ");
        }

    }
    public static boolean is_prime(int x)
    {
        if(x<=1)
        {
            return false;
        }
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }


}
