/*
 Question:Implement a static method,validate_student_id, in the Student class
 that checks if a student ID is valid.
 ● Logic:Use the @staticmethod decorator to define a static method that doesn't
 depend on instance-specific data.
 ● Sample Input:Student.validate_student_id("12345")
 ● Expected Output:True if the student ID is valid,False otherwise.
 */
package oops;

public class static_methods {

        public static boolean validate_student(String id)
        {
            if(id==null)
            {
                return false;
            }
            if(id.length()!=5)
            {
                return false;
            }
            for(char c:id.toCharArray())
            {
                if(!Character.isDigit(c))
                {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        System.out.println(static_methods.validate_student("12345"));
    }
}
