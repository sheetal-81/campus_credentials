/*

 ○ Question:Write a function to check if one dictionary is a superset of another.
 ○ Logic:Iterate through the first dictionary and check if its key-value pairs exist in the second dictionary.
 ○ Sample Input:SupersetDict:{"A":1,"B":2,"C":3},SubsetDict:{"A":1, "B":2}
 ○ Expected Output:Superset

 */


/*package dictionary;

import java.util.HashMap;
import java.util.Map;

public class check_if_dictionary_is_superset_of_another {
    public static void main(String[] args) {
        HashMap<String,Integer>a=new HashMap<>();
        HashMap<String,Integer>b=new HashMap<>();
        a.put("A",1);
        a.put("B",1);
        a.put("C",1);
        System.out.println("First hashmap values are :- " + a);

        b.put("A",1);
        b.put("B",2);
        System.out.println("Second hashmap values are :- " + b);

        for(Map.Entry<String,Integer>a_ans:a.entrySet())
        {
            for(Map.Entry<String,Integer>b_ans:b.entrySet())
            {
                if(!a.containsKey(b_ans.getKey() || b.get(a_ans.getKey())!=(a_ans.getValue()))
            }
        }


    }
}
*/