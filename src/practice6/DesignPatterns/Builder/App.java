package practice6.DesignPatterns.Builder;

public class App {
    public static void main(String[] args) {
        Order order1 = new Order.OrderBuilder().setDrink("Капучино").build();

        Order order2 = new Order.OrderBuilder().setMainCourse("Стейк рибай medium rare").setSideDish("запечённый картофель с розмарином").setDessert("Наполеон").setDrink("Бокал красного вина (Каберне Совиньон)").build();

        System.out.println(order1);
        System.out.println(order2);

    }
}
