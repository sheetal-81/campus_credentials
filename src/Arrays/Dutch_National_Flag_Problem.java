/*
{1} Initialize three pointers: low, mid, and high.
{2} Set low and mid to the start of the array (index 0) and high to the end of the array (index n-1, where n is the length of the array).
{3} Traverse the array from left to right using the mid-pointer:
    If nums[mid] is 0, swap nums[mid] with nums[low], increment both low and mid.
    If nums[mid] is 1, leave it in place and increment mid.
    If nums[mid] is 2, swap nums[mid] with nums[high], decrement high.
{4} Repeat step 3 until mid is less than or equal to high.
{5} The array will now be sorted in the desired order.
 */
package Arrays;

public class Dutch_National_Flag_Problem {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 2, 1, 0};
        int low = 0; // Pointer for 0s
        int mid = 0; // Pointer for 1s
        int high = nums.length - 1; // Pointer for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[mid] with nums[low]
                int tempLow = nums[low];
                nums[low] = nums[mid];
                nums[mid] = tempLow;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // No swapping needed, just increment mid
                mid++;
            } else if (nums[mid] == 2) {
                // Swap nums[mid] with nums[high]
                int tempHigh = nums[high];
                nums[high] = nums[mid];
                nums[mid] = tempHigh;
                high--;
            }
        }

        // Print the sorted array
        System.out.print(" Adjusting of 0s and 1s :- ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


