package practice6.DesignPatterns.AbstractFactory;

abstract public class Button {
    private final String name;
    private String value = "Button";
    private int width = 50;
    private int height = 50;
    private String color = "White";
    private boolean isFilled = false;

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String placeHolder) {
        this.value = placeHolder;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSize() {
        return width + "x" + height;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }


    public String draw() {
        return "Кнопка " + name + ":\nЗначение: " + value + "\nРазмер: " + width + "x" + height + "\nЦвет: " + color + "\nЗаливка: " + isFilled;
    }

}
