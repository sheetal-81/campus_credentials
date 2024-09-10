package Arrays;
import java.util.*;
public class Rearrange_Positive_and_Negative_Numbers {
    public static void main(String[] args) {
        int arr[]={-1,2,-3,4,5,-6};
        int pos_arr=0;
        int neg_arr=0;
        int pos[]=new int[arr.length];
        int neg[]=new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>0)
            {
                pos[pos_arr++]=arr[i];
            }
            else
            {
                neg[neg_arr++]=arr[i];
            }
        }
        int index=0;

    }
}
