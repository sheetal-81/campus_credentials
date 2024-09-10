package Arrays;

import java.util.Scanner;
import java.util.*;
public class Find_the_Second_Largest_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,6,9,8,3,4,80,100};
        Arrays.sort(arr);
        System.out.println("The Second largest number is : "+arr[arr.length-2]);


    }
}
