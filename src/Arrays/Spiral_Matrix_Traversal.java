package Arrays;

import java.util.Scanner;

public class Spiral_Matrix_Traversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;i< arr.length;j++)
            {
                for(int k=0;k< arr.length;k++)
                {
                    System.out.println(arr[i][j]);
                }

            }

        }
    }
}
