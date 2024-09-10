/*
*  Question:Add a method introduce to the Person class that prints a greeting using the name attribute.
 ● Logic:Define a method within the class that takes self as its first parameter to access instance variables.
 ● Sample Input:person1.introduce()
 ● Expected Output:"Hello,myname is Alice."
 */

// A method is a block of code which only runs when it is called.
// A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().
// You can pass data, known as parameters, into a method.
package oops;

public class class_methods {
    private String name;
    private int age ;



    public class_methods(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "class_methods{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void introduce_name()
    {
        System.out.println("hello , My name is " + name);
    }
    public void introduce_age()
    {
        System.out.println("and age is " + age);
    }

    public static void main(String[] args) {
        class_methods cm=new class_methods("alice",30);
        cm.introduce_name();
        cm.introduce_age();
    }
}
