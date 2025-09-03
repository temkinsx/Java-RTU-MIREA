package practice4.figures.app;

import practice4.figures.exceptions.IllegalTriangleException;
import practice4.figures.geometry.*;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] figures = null;
        try{
            figures = new GeometricObject[] {
                new Circle(9, "Белый", true),
                new ComparableCircle(2, "Зеленый", false),
                new Rectangle(3, 4, "Синий", true),
                new Square(5),
                new Triangle(3, 4, 5, "Красный", true),
            };
        } catch(IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        for (GeometricObject fig : figures){
            System.out.println(fig + ", площадь: " + fig.getArea());

            if (fig instanceof Colorable){
                ((Colorable) fig).howToColor();
            }
            System.out.print("\n");
        }
    }

}
