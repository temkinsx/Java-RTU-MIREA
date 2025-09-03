package practice4.figures.geometry;

abstract public class GeometricObject implements Comparable<GeometricObject> {
    private String color = "белый";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Создает по умолчанию заданный геометрический объект */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Создает геометрический объект с указанным цветом и заливкой */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Возвращает цвет */
    public String getColor() {
        return color;
    }

    /** Присваивает новый цвет */
    public void setColor(String color) {
        this.color = color;
    }

    /** Возвращает заливку. Поскольку filled типа boolean,
     *  getter-метод называется isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Присваивает новую заливку */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Получает dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Возвращает строковое представление этого объекта */
    public String toString() {
        return "создан " + dateCreated + ",\nцвет: " + color +
                ", заливка: " + filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() >  o.getArea()) {
            return 1;
        } else if (this.getArea() <  o.getArea()) {
            return -1;
        }
        return 0;
    }

    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2){
        if (obj1.compareTo(obj2) >= 0) {
            return obj1;
        } else {
            return obj2;
        }
    }

    abstract public double getArea();
    abstract public double getPerimeter();
}