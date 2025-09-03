package practice4.figures.geometry;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    /** Создает по умолчанию заданный прямоугольник */
    public Rectangle() {
    }

    /** Создает прямоугольник с указанной шириной и высотой */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Создает прямоугольник с указанной шириной, высотой, цветом и заливкой */
    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /** Возвращает ширину */
    public double getWidth() {
        return width;
    }

    /** Присваивает новую ширину */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Возвращает высоту */
    public double getHeight() {
        return height;
    }

    /** Присваивает новую высоту */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Возвращает площадь */
    @Override
    public double getArea() {
        return width * height;
    }

    /** Возвращает периметр */
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString(){
        return "Прямоугольник: " + super.toString() + ", ширина = " + width + ", высота: " +  height;
    }
}