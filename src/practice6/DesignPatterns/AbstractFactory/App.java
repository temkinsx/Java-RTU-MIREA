package practice6.DesignPatterns.AbstractFactory;


public class App {
    public static void main(String[] args) {
        GUIFactory winFactory = new WinGUIFactory();
        GUIFactory macFactory = new MacGUIFactory();

        Button winButton = winFactory.createButton("Кнопка1");
        winButton.setValue("Отправить");
        winButton.setWidth(120);
        winButton.setHeight(40);
        winButton.setColor("Black");
        winButton.setFilled(true);

        Button macButton = macFactory.createButton("Кнопка2");

        Checkbox winCheckbox = winFactory.createCheckBox("Чекбокс1");
        Checkbox macCheckbox = macFactory.createCheckBox("Чекбокс2");
        macCheckbox.setValue("Согласен с условиями");
        macCheckbox.setSize(20, 20);
        macCheckbox.setIsChecked(true);

        System.out.println(winButton.draw() + "\n");
        System.out.println(macButton.draw() + "\n");

        System.out.println(winCheckbox.draw() + "\n");
        System.out.println(macCheckbox.draw() + "\n");
    }
}
