/*
○ Question: Write a function to calculate the simple interest for a principal amount, rate, and time.
○ Logic: Define a function that uses the simple interest formula.
○ Sample Input: Principal amount = 1000, Rate = 5%, Time = 3 years
○ Expected Output: 150.0
 */
package function;

public class Calculate_Simple_Interest {
    public static double cal_simInt(double p,double r,double t)
    {
        double ans=(p*r*t)/100;
        return ans;
    }
    public static void main(String[] args) {
        double ans=cal_simInt(1000,5,3);
        System.out.println(ans);
    }
}
