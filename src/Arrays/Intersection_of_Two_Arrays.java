/*
ALGORITHM
{1} Apply for loop in first array
{2} Apply for loop in Second array
{3} if first array element matched with second array element then print
{4} and take break from both loop
 */
package Arrays;
import java.util.*;
public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr1[]={1,2,5,70};
    int arr2[]={70,5,2};
        System.out.println("Intersection of two arrays are :- ");
    for(int i=0;i< arr1.length;i++)
    {
        for(int j=0;j< arr2.length;j++)
        {
            if(arr1[i]==arr2[j])
            {
                System.out.print(arr1[i] +" ");
                break;
            }

        }
    }
    }
}
