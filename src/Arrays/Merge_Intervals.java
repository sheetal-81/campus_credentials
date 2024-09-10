package Arrays;
import java.util.*;
public class Merge_Intervals {
    public static void main(String[] args) {
        int[][]arr={{1,3} ,{2,6},{8,10},{15,18}};
        System.out.println("The array addition is " + Arrays.deepToString(arr));
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }


    }
}
