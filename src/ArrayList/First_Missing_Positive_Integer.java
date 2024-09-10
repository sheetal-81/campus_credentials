/*

○ Question: Write a function to find the smallest missing positive integer in a list of unsorted integers.
○ Logic: Use a loop and reposition elements to place each positive integer at its respective index.
○ Sample Input: [7, 8, 9, 11, 12]
○ Expected Output: 1

 */
package ArrayList;

public class First_Missing_Positive_Integer {
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 11, 12};
        int n = arr.length;
        int j = 0;

        // First separate positive and negative numbers
        for(int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        int arr2[] = new int[n-j];
        int arr_size = 0;
        for(int i = j; i < n; i++) {
            arr2[arr_size++] = arr[i];
        }

        // Mark arr[i] as visited by making arr[arr[i] - 1] negative
        for(int i = 0; i < arr_size; i++) {
            int x = Math.abs(arr2[i]);
            if(x - 1 < arr_size && arr2[x - 1] > 0) {
                arr2[x - 1] = -arr2[x - 1];
            }
        }

        // Return the first index value at which is positive
        int missing = arr_size + 1;
        for(int i = 0; i < arr_size; i++) {
            if (arr2[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        System.out.println("The first missing positive number is :- " + missing);
    }
}
