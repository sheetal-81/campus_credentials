/*

○ Question: Write a function to find the union of two lists.
○ Logic: Use list comprehensions or a loop to combine the lists.
○ Sample Input: List 1: [1, 2, 3], List 2: [3, 4, 5]
○ Expected Output: [1, 2, 3, 4, 5]

 */
package ArrayList;

public class Find_the_Union_of_Two_Lists {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={3,4,5};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] union = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                union[k++] = arr1[i++];
            } else if (arr2[j] < arr1[i]) {
                union[k++] = arr2[j++];
            } else {
                union[k++] = arr2[j++];
                i++;
            }
        }

        while(i < n1) {
            union[k++] = arr1[i++];
        }

        while(j < n2) {
            union[k++] = arr2[j++];
        }

        System.out.println("The union array :- ");
        for(i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}

