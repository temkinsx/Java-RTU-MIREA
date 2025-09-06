package practice6.DesignPatterns.AbstractFactory;

public class Checkbox {
    private final String name;
    private String value = "CheckBox";
    private int width = 50;
    private int height = 50;
    private boolean isChecked = false;


    public Checkbox(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String placeHolder) {
        this.value = placeHolder;
    }

    public String getSize() {
        return width + "x" + height;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String draw() {
        return "Чекбокс " + name + ":\nЗначение: " + value + "\nРазмер: " + width + "x" + height + "\nОтмечен по умолчанию: " + isChecked;
    }
}
