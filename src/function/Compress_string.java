/*
○ Question:Write a program to compress a string by replacing consecutive characters with their counts.
○ Logic:Use loops to count consecutive characters and create the compressed string.
○ Sample Input:"aaabbbcccc"
○ Expected Output:"a3b3c4"
 */
package function;

public class Compress_string {
    public static String comp_str(String str)
    {
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            result.append(str.charAt(i-1)).append(count);
            count=1;
        }
        result.append(str.charAt(str.length()-1)).append(count);
        return result.toString();
    }

    public static void main(String[] args) {
        String str="aaabbbcccc";
        String compress=comp_str(str);
        System.out.println("The compressed string is :- " + compress);



    }
}
