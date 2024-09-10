/*

○ Question: Write a function to check if a number is an Armstrong number.
○ Logic: Define a function that checks if the number is equal to the sum of its own digits raised to the power of the number of digits.
○ Sample Input: 153
○ Expected Output: Armstrong Number

 */
package function;

public class check_for_armstrong {
    public static int arm_no(int num) {
        int result = 0;
        int originalNum = num; // Store the original number

        while (num != 0) {
            int rem = num % 10;
            result += Math.pow(rem, 3);
            num = num / 10;
        }

        if (result == originalNum) {
            return originalNum; // It's an Armstrong number
        } else {
            return 0; // Not an Armstrong number
        }
    }

    public static void main(String[] args) {
        int num = 153;
        int ans = arm_no(num);
        if (ans != 0) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
