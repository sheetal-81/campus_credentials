package Arrays;
import java.util.*;
public class Largest_Subarray_with_Zero_Sum {
    public static void main(String[] args) {
        int arr[]={4,2,-3,1,6};
        int maxLen=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;++i)
        {
            int sum=0;
            for(int j=i;j<arr.length;++j)
            {
                sum+=arr[j];
                if(sum==0 && maxLen<j-i+1)
                {
                    maxLen=j-i+1;
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println(maxLen);
        for(int i=start;i<=end;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

}
