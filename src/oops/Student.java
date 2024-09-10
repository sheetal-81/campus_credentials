package oops;

public class Student extends inheritance{
    private String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println(id);
    }
}
