package practice4.figures.geometry;

public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }


    public int compareTo(ComparableCircle o) {
        return Double.compare(this.getArea() , o.getArea());
    }

    @Override
    public String toString() {
        return "ComparableCircle " +  super.toString();
    }
}
