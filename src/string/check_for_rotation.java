/*
○ Question: Write a program to check if one string is a rotation of another string.
○ Logic: Concatenate one string with itself and check if the other string is a substring.
○ Sample Input: "waterbottle" and "erbottlewat"
○ Expected Output: Rotation
 */
package string;

public class check_for_rotation {
    public static void main(String[] args) {
        String a="waterbottle";
        String b="erbottlewat";
        String c=a.concat(a);
        if(c.contains(b))
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not a rotation");
        }

    }

}
