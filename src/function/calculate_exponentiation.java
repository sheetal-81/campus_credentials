/*

○ Question: Write a function to calculate the result of raising a number to a given exponent.
○ Logic: Define a function that uses a loop to multiply the number by itself for the specified number of times.
○ Sample Input: Number = 2, Exponent = 5
○ Expected Output: 32


 */
package function;

public class calculate_exponentiation {
    public static double cal_exp(int num,int exp)
    {
        double ans=Math.pow(num,exp);
        return ans;
    }
    public static void main(String[] args) {
        double ans=cal_exp(2,5);
        System.out.println(ans);

    }
}
