package oops;

class Student_mo  extends method_overriding{
    private int student_id;

    public Student_mo(String name, int student_id) {
        super(name);
        this.student_id = student_id;
    }

    @Override
    public String introduce() {
        return "hello my name is "+name+ " , and id is " +student_id;
    }

    public Student_mo(int form_no) {
        super(form_no);
    }
}
