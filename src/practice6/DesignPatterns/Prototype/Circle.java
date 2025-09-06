package practice6.DesignPatterns.Prototype;

public class Circle implements Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(radius);
    }


    @Override
    public String toString() {
        return "Круг, радиус: " + radius;
    }
}