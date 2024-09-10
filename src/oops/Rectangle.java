package oops;

public class Rectangle extends AbstractBaseClass {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area()
    {
        return length*breadth;
    }
    @Override
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
