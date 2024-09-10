/*

○ Question: Write a function to check if a list is a palindrome.
○ Logic: Compare the list with its reverse.
○ Sample Input: [1, 2, 3, 2, 1]
○ Expected Output: Palindrome

 */
package ArrayList;

public class Check_for_Palindromic_List {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,5};
        int i=0;
        int j= arr.length-1;
        while(i<j)
        {
            if(arr[i]!=arr[j])
            {
                System.out.println("The list is not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("The list is palindrome");

    }
}
