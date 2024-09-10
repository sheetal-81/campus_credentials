/*
When a method in a subclass has the same name, the same parameters or signature,
and the same return type(or sub-type) as a method in its super-class,
then the method in the subclass is said to override the method in the super-class.
 */

//Private -->Only within the same class	--> Encapsulation hides details from outside classes.
//Protected -->Within the same package and subclasses -->Allows access in subclasses controls inheritance.
//Public --> Accessible from any other class in any package	--> To make class members universally accessible.
//Default --> Within the same package (package-private) -->	Restricts access to classes within the same package, preventing access from outside.

package oops;
public class method_overriding {
    protected String name;
    protected int form_no;//1000588064

    public method_overriding(String name) {
        this.name = name;
    }

    public method_overriding(int form_no) {
        this.form_no = form_no;
    }

    public String introduce()
    {
        return "Hello my name is " + name;
    }
    public String form_number()
    {
        return  form_no + " detail of form number " ;
    }
    public String myName ()
    {
        return "let it be ";
    }

    public static void main(String[] args) {
        Student_mo std=new Student_mo("Sheetal",2060);
        Student_mo fo=new Student_mo(100058816);
        System.out.println(std.myName());
        System.out.println(std.introduce());
        System.out.println(fo.form_number());
    }
}
