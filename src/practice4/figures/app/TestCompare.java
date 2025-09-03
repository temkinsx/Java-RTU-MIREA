package practice4.figures.app;

import practice4.figures.geometry.GeometricObject;
import practice4.figures.geometry.Circle;
import practice4.figures.geometry.ComparableCircle;
import practice4.figures.geometry.Rectangle;

public class TestCompare {
    public static void main(String[] args) {
        Circle circle1 = new Circle(9, "Белый", true);
        Circle circle2 = new Circle(4, "Черный",  false);

        ComparableCircle comparableCircle1 = new ComparableCircle(2, "Зеленый", false);
        ComparableCircle comparableCircle2 = new ComparableCircle(5, "Красный", true);

        Rectangle rectangle1 = new Rectangle(3, 4, "Синий", true);
        Rectangle rectangle2 = new Rectangle(5, 5, "Фиолетовый", true);

        System.out.println("Circle1 " + circle1 + "\n");
        System.out.println("Circle2 " + circle2 + "\n");
        System.out.println("comparableCircle1 " + comparableCircle1 + "\n");
        System.out.println("comparableCircle1 " + comparableCircle2 + "\n");
        System.out.println("rectangle1 " + rectangle1 + "\n");
        System.out.println("rectangle2 " + rectangle2 + "\n");

        System.out.println("Наибольший из кругов Circle (через max): " + (GeometricObject.max(circle1, circle2) == circle1 ? "circle1" : "circle2"));
        System.out.println("Наибольший из двух прямоугольников Rectangle (через max): " + (GeometricObject.max(rectangle1, rectangle2) == rectangle1 ? "rectangle1" : "rectangle2"));
        System.out.println("Наибольший из двух кругов ComparableCircle (через toCompare): " + ((comparableCircle1.compareTo(comparableCircle2) >= 0) ? "comparableCircle1" : "comparableCircle1"));
        System.out.println("Наибольший из comparableCircle1 и rectangle1 (через toCompare): " + ((comparableCircle1.compareTo(rectangle1) >= 0) ? "comparableCircle1" : "rectangle1"));
    }
}