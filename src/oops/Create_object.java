/*
 ● Question:Create an instance of the Person class and assign values to the
 name and age attributes.
 ● Logic:Instantiate an object of the class and set attribute values.
 ● Sample Input:person1=Person("Alice",30)
 ● Expected Output:person1 is an object with name="Alice"and age=30.
 */
package oops;

public class Create_object {
    private String name;
    private int age;
    private Double salary;
    public Create_object(String name,int age,Double salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public Double getSalary()
    {
        return getSalary();
    }
    public void setName()
    {
        this.name=name;
    }
    public void setAge()
    {
        this.age=age;
    }
    public void setSalary()
    {
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Create_object{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Create_object ca=new Create_object("Alice",30, 500000000.0);
        Create_object cs=new Create_object("sheetal" ,22,35000.0);
        Create_object cv=new Create_object("vandana",19,1000000.85);
        System.out.println("\n " + ca + "\n" + cs + "\n"+cv);
    }

}
