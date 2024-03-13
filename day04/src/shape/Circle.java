package shape;

public class Circle extends Shape{
    private double radius;
    public Circle() {

    }
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    public double getRadius() {
        return 2*radius*3.14;
    }

    @Override
    public double getCircume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
