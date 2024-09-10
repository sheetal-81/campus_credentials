/*

○ Question:Write a function to count the number of occurrences of a substring in a given string.
○ Logic:Define a function that uses loops to search for the substring and count occurrences.
○ Sample Input:"abababab"and"ab"
○ Expected Output:4

 */
/*
package function;

public class Count_Substrings_in_String {
    public static String count_substr(String str,String sub)
    {
        int count=0;
        for(int i=0;i<=str.length()-sub.length();i++)
        {
            if(str.substring(i,i+sub.length()).equals(str.length()))
            {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str="abababab";
        String sub="ab";
        int cnt=count_substr(sub,str);
        System.out.println(cnt);


    }
}
*/