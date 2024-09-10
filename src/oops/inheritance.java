// In Java,To inherit attributes and methods from one class to another.
// Where inheritance is categorise into ----> (1) subClass (2) superClass
// subclass (child) - the class that inherits from another class superclass (parent) - the class being inherited from
// To inherit from a class, use the extends keyword.

/*
● Question:Create a subclass Student that inherits from Person and add an additional attribute,student_id.
 ● Logic:Define a new class that inherits attributes and methods from the
 parent class and add new attributes / methods.
 ● Sample Input:N/A
 ● Expected Output:N/A
 */
package oops;

public class inheritance {
    private String name;
    private int age;

    public inheritance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display_info()
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        //create an object
        Student sd=new Student("sheetal",50,"789654123");
        sd.display_info();
    }

}
