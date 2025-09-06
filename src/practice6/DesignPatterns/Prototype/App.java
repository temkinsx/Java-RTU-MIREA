package practice6.DesignPatterns.Prototype;

public class App {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(15);
        Rectangle originalRectangle = new Rectangle(10, 5);

        System.out.println("Оригинальный круг: " + originalCircle);
        System.out.println("Оригинальный прямоугольник: " + originalRectangle);

        Circle newCircle = (Circle) originalCircle.clone();
        Rectangle newRectangle = (Rectangle) originalRectangle.clone();

        newCircle.setRadius(10);
        newRectangle.setWidth(43);
        newRectangle.setLength(15);

        System.out.println("\nПосле изменения:\nНовый круг: " + newCircle);
        System.out.println("Новый прямоугольник: " + newRectangle);

        System.out.println("Оригинальный круг: " + originalCircle);
        System.out.println("Оригинальный прямоугольник: " + originalRectangle);
    }
}
