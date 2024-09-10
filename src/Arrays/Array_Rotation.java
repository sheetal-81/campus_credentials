/*
ALGORITHM
{1} create one array, in that assign the length of original array
{2} Take for loop
        apply (i+steps)%arr.length;
        assign the arr[i] value to created array
{3} print the rotated array
 */
package Arrays;

import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fir_arr[]={10,50,40,15,56};
        int steps=7;
        int sec_arr[]=new int[fir_arr.length];
        for(int i=0;i< fir_arr.length;i++)
        {
            int ans=(i+steps)% fir_arr.length;
            sec_arr[ans]=fir_arr[i];
        }
        System.out.print("The array rotation is : ");
        for(int fin:sec_arr)
        {
            System.out.print(fin +" ");
        }

    }

}
