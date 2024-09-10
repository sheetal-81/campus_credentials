/*

 ○ Question:Write a function to count the frequency of elements in a list using a dictionary.
 ○ Logic:Iterate through the list and use a dictionary to store counts.
 ○ Sample Input:[1,2,2,3,4,3,5]
 ○ Expected Output:{"1":1,"2":2,"3":2,"4":1,"5":1}

 */
package dictionary;

import java.util.HashMap;
import java.util.*;
public class count_frequency_of_element_inList {
    public static void main(String[] args) {
        HashMap<Integer,Integer>a=new HashMap<>();
        int arr[]={1,2,2,3,4,3,5};

        for(int element:arr)
        {
            a.put(element,a.getOrDefault(element,0)+1);
        }
        // Print the frequencies
        for (int key : a.keySet()) {
            System.out.print(key +":" + a.get(key) + " , " );
        }



    }
}
