/*

○ Question: Write a function to find the longest subarray with an equal number of 0s and 1s in a list of binary integers.
○ Logic: Use a loop and keep track of the longest subarray with a balance of 0s and 1s.
○ Sample Input: [0, 1, 0, 0, 1, 1, 0]
○ Expected Output: [0, 1, 0, 0, 1, 1]


 */
package ArrayList;

public class Longest_Subarray_with_Equal_0s1s {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 0, 1, 1, 0};
        int n = arr.length;
        int sum = 0;
        int maxLength = 0, endingIndex = -1;
        int startIndex = 0;

        for (int i = 0; i < n - 1; i++) {
            sum = (arr[i] == 0) ? -1 : 1;

            for (int j = i + 1; j < n; j++) {
                sum = sum + ((arr[j] == 0) ? -1 : 1);

                if (sum == 0 && maxLength < j - i + 1) {
                    maxLength = j - i + 1;
                    endingIndex = j;
                }
            }
        }

        if (endingIndex != -1) {
            //System.out.println("The longest subarray with equal 0s and 1s is from index " + (endingIndex - maxLength + 1) + " to " + endingIndex);
            System.out.print("The subarray is: ");
            for(int i = endingIndex - maxLength + 1; i <= endingIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("No such subarray");
        }
    }
}
