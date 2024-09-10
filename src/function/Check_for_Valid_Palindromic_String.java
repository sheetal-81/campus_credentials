/*

 ○ Question:Write a program to check if a given string is a valid palindromic string after ignoring non-alphanumeric characters and considering case.
 ○ Logic:Use loops to compare characters while ignoring non-alphanumeric characters.
 ○ Sample Input:"Aman,aplan,acanal:Panama"
 ○ Expected Output:Valid Palindrome

 */

package function;
public class Check_for_Valid_Palindromic_String {
    public static String val_pal_str(String str)
    {
        String c= str.replace("[a-zA-z0-9]"," ").toLowerCase();
        for(int i=0;i<c.length();i++)
        {
            for(int j=c.length();j<0;j++)
            {
                if(c.charAt(i)==c.charAt(j))
                {
                    System.out.println("valid");
                }
            }
        }
        return "Not valid";

    }
    public static void main(String[] args) {
        String str="Aman,aplan,acanal:Panama";
        String ans=val_pal_str(str);
        System.out.println("The valid palindromic is :- " + ans);
    }
}

