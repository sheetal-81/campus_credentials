/*

○ Question: Write a program to generate the nth term of the "Count and Say" sequence.
○ Logic: Use loops to generate the sequence based on the previous term.
○ Sample Input: 4
○ Expected Output: "1211"

 */
package string;

public class count_and_say_sequence {
    public static void main(String[] args) {
        int n=5;
        if(n==1)
        {
            System.out.println(1);
        }
        if(n==2)
        {
            System.out.println(2);
        }
        String str="11";
        for(int i=3;i<=n;i++)
        {
            str=str+"&";
            int len=str.length();
            int count=1;
            StringBuilder tmp=new StringBuilder();
            for (int j = 1; j < len; j++) {
                if (str.charAt(j) != str.charAt(j - 1)) {
                    tmp.append(count).append(str.charAt(j - 1));
                    count = 1;
                } else {
                    count++;
                }
            }
            str = tmp.toString(); // Update the current term
        }
        System.out.println("the count and say sequence is :- " + str);
    }

    }

