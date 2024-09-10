/*

 ○ Question:Rotate an array to the right by a given number of steps.
 ○ Logic:Use arrays slicing or create a new array to rearrange elements according to the rotation steps.
 ○ Sample Input:[1,2,3,4,5] rotated by 2 steps
 ○ Expected Output:`[4,5,1,2,3]

 */

/*
package function;

public class Check_for_Rotation {
    public static int chck_rot(int arr[], int k)
    {
        int sec_arr[]=new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            int ans=(i+k)% arr.length;
            sec_arr[ans]=arr[i];
        }
        for(int a:sec_arr)
        {
            System.out.println(a + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        int fin=chck_rot(arr,k);
        System.out.println(fin);
    }
}
*/