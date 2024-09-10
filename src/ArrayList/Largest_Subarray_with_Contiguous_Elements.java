/*

○ Question: Write a function to find the largest subarray with contiguous elements in a list.
○ Logic: Use a loop and keep track of the longest contiguous subarray.
○ Sample Input: [1, 2, 3, 4, 6, 7, 8, 9, 10]
○ Expected Output: [1, 2, 3, 4]

 */
package ArrayList;

public class Largest_Subarray_with_Contiguous_Elements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int n = arr.length;
        int max_len = 1;
        int start = 0;
        int end = 0;

        for (int i=0; i<n-1; i++) {
            int min_val = arr[i], max_val = arr[i];
            for (int j=i+1; j<n; j++) {
                min_val = Math.min(min_val, arr[j]);
                max_val = Math.max(max_val, arr[j]);

                if ((max_val-min_val) == j-i) {
                    int len = max_val-min_val+1;
                    if (len > max_len) {
                        max_len = len;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        System.out.println("The largest subarray with contiguous elements :- ");
        for(int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
