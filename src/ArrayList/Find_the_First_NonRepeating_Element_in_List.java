/*
○ Question: Write a function to find the first non-repeating element in a list.
○ Logic: Use a loop and a dictionary to count occurrences.
○ Sample Input: [1, 2, 3, 2, 1, 4, 5]
○ Expected Output: 3

 */

package ArrayList;

public class Find_the_First_NonRepeating_Element_in_List {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 2, 1, 4, 5};
        int max = 0;

        // Find the maximum element in the array
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }

        // Create a count array with size max+1
        int[] countArr = new int[max+1];

        // Count occurrences of each element
        for(int num : arr) {
            countArr[num]++;
        }

        // Find the first non-repeating element
        System.out.println("The first non-repeating element in a list :- ");
        for(int num : arr) {
            if(countArr[num] == 1) {
                System.out.println(num);
                break;
            }
        }
    }
}

