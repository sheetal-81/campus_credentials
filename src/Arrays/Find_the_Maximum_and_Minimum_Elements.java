package Arrays;
import java.util.*;
import java.util.Scanner;

public class Find_the_Maximum_and_Minimum_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,0,50,258,-356};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];

            }
            else
            {
                min=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);

        //This is mine logic
        int n= arr.length;
        Arrays.sort(arr);
        System.out.println("\nThe minimum elements is = " + arr[0]);
        System.out.println("The maximum element is = " + arr[n-1]);

    }

}
