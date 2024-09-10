/*

○ Question: Write a function to calculate the compound interest for a principal amount, rate, and time.
○ Logic: Define a function that uses a loop to calculate compound interest based on the formula.
○ Sample Input: Principal amount = 1000, Rate = 5%, Time = 3 years
○ Expected Output: 157.63

 */


//formula =>>  CI = P(1 + r/100)n – P
package function;
import java.util.*;
public class Calculate_Compound_Interest {
    public static double cal_comp(double p,double r,double t)
    {
        double amount=p*Math.pow((1+r/100),t);
        double ci=amount-p;
        return ci;
    }
    public static void main(String[] args) {
        double ci=cal_comp(1000,5,3);
        System.out.println(ci);

    }
}
