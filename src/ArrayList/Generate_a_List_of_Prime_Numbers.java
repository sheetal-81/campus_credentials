/*

○ Question: Write a function to generate a list of prime numbers within a given range.
○ Logic: Use loops and checks to find prime numbers.
○ Sample Input: Range: 1 to 20
○ Expected Output: List of Prime Numbers: [2, 3, 5, 7, 11, 13, 17, 19]

 */
package ArrayList;

public class Generate_a_List_of_Prime_Numbers {
    public static void main(String[] args) {
        int[] primes = new int[20];
        int index = 0;

        for(int i = 2; i <= 20; i++) {
            boolean isPrime = true;
            for(int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes[index++] = i;
            }
        }

        System.out.println("The prime numbers between 2 to 20 is :- ");
        for(int i = 0; i < index; i++) {
            System.out.print(primes[i] + " ");
        }
    }
}
