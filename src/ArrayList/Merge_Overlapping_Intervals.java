/*

○ Question: Write a function to merge overlapping intervals in a list.
○ Logic: Use sorting and a loop to merge overlapping intervals.
○ Sample Input: [[1, 3], [2, 6], [8, 10], [15, 18]]
○ Expected Output: [[1, 6], [8, 10], [15, 18]]

 */
package ArrayList;

public class Merge_Overlapping_Intervals {
    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int n = arr.length;

        // Sort the intervals based on start time
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int index = 0; // Stores index of last element in output array (modified arr[])

        // Traverse all input intervals
        for (int i=1; i<n; i++) {
            // If this is not first interval and overlaps with the previous one
            if (arr[index][1] >= arr[i][0]) {
                // Merge previous and current intervals
                arr[index][1] = Math.max(arr[index][1], arr[i][1]);
            } else {
                index++;
                arr[index] = arr[i];
            }
        }

        // Now arr[0..index] stores the merged intervals
        System.out.print("The merged intervals are: ");
        for (int i = 0; i <= index; i++) {
            System.out.print("[" + arr[i][0] + ", " + arr[i][1] + "] ");
        }
    }
}
