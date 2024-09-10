/*
 Question:Define a Java class named Person with attributes name and age.
 Logic:Use the class keyword to create a class and define instance variables for attributes.
 SampleInput:N/A
 ExpectedOutput:N/A
 */
package oops;

public class Person {
    private String name;
    private int age;
    private String college;

    public Person(String name, int age, String college) {
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCollege() {
        return college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void displayDetails() {
        System.out.println("My name is " + name + ". I am " + age + " years old. And I study in " + college);
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", college='" + college + "'}";
    }



    public static void main(String[] args) {
        Person myPerson = new Person("Anjali", 34, "sjcem");
        System.out.println(myPerson);
        myPerson.displayDetails();
    }
}
