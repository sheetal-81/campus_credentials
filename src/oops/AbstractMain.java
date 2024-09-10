/*
● Question:Create an abstract base class Shape with abstract methods area and perimeter that subclasses like Circle and Rectangle must implement.
 ● Logic:Use the abc module to define abstract base classes with abstract methods.
 ● Sample Input:N/A
 ● Expected Output:N/A
 */
package oops;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractBaseClass cir=new Circle(5);
        AbstractBaseClass rec=new Rectangle(5,2);
        System.out.println("\nArea of circle is :- "+ cir.area());
        System.out.println("Area of Rectangle is :- " +rec.area());
        System.out.println("Perimeter of circle is :-" +cir.perimeter());
        System.out.println("Perimeter of Rectangle is :- " +rec.perimeter() );
    }
}
