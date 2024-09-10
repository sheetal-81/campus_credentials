/*
ALGORITHM
[1] Take max_profit as 0;
[2] Hold the arr[0] value in min_price
[3] Apply for loop in that start iterating from index no. 1 as min_price holds the arr[0]
[4] if arr[i] is less than min_price then assign arr[i] to min_price4
[5] else if arr[i]-min_price >max_profit then assign arr[i]-min_price to max_profit
[6] At last come out of for loop print max_profit
 */
package Arrays;
import java.util.*;
public class Stock_Buy_and_Sell {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int max_profit=0;
        int min_price=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min_price)
            {
                min_price=arr[i];
            }
            else if(arr[i]-min_price>max_profit)
            {
                max_profit=arr[i]-min_price;
            }
        }
        System.out.println(max_profit);
    }
}
