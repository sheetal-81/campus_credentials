/*
ALGORITHM
{1} Take the array Length
{2} take the expected sum [n*(n+1)/2]
{3} Take the sum of all elements present in array
{4} Subtract {2} - {3}
 */

package Arrays;
import java.util.*;
public class Find_Missing_Number_in_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={0,1,2,4,5};
        int a= arr.length;
        int sum=a*(a+1)/2;
        int total=0;
        for(int ans:arr)
        {
            total+=ans;
        }
        int ab=sum-total;
        System.out.println(ab);
    }

}
