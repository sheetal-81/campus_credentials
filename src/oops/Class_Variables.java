// In Java, a variable is a named memory location used to store data, and it serves as the basic unit of storage in a program.
// The value of a variable can be changed during the program's execution, and any operations on the variable affect its associated memory location.
// All variables must be declared before they are used in a program.

/*
 ● Question:Add a class variable,total_students, to the Student class to keep
 track of the number of student instances.
 ● Logic:Use a class variable to share data among all instances of the class.
 ● Sample Input:Student.total_students
 ● Expected Output:Total number of Student instances.
 */
package oops;

public class Class_Variables {
    public static int noOfStudents=0;
    private String name;
    private int id;
    private double salary;

    public Class_Variables(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        noOfStudents++;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Class_Variables cv1=new Class_Variables("sheetal",2060,30000000);
        Class_Variables cv2=new Class_Variables("sheetal",2060,30000000);
        Class_Variables cv3=new Class_Variables("sheetal",2060,30000000);
        System.out.println(Class_Variables.noOfStudents);


    }
}
