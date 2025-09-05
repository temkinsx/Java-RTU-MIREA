package practice6.DesignPatterns.FactoryMethod;

/*
Тестовый класс для DeliveryService. Можно реализовать ввод с клавиатуры (при необходимости)
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class TestDelivery {
    public static void main(String[] args) {
        Map<String, Integer> pizzaOrder;
        Map<String, Integer> groceryOrder = new LinkedHashMap<>();
        DeliveryService pizzaDelivery = new PizzaDelivery();
        DeliveryService groceryDelivery = new GroceryDelivery();

        pizzaDelivery.setStock(Map.of(
                "Маргарита", 450.0,
                "Пепперони", 520.0,
                "Четыре сыра", 600.0,
                "Кока-кола 0.5л", 120.0,
                "Соус чесночный", 50.0
        ));
        pizzaOrder = Map.of(
                "Маргарита", 2,
                "Кока-кола 0.5л", 3,
                "Соус чесночный", 1
        );

        groceryDelivery.setStock(Map.of(
                "Яблоки (1 кг)", 120.0,
                "Бананы (1 кг)", 100.0,
                "Картофель (1 кг)", 60.0,
                "Помидоры (1 кг)", 140.0,
                "Огурцы (1 кг)", 130.0,
                "Молоко 1л", 80.0,
                "Хлеб пшеничный", 45.0,
                "Яйца (10 шт.)", 90.0,
                "Сыр российский (1 кг)", 650.0,
                "Курица (1 кг)", 280.0
        ));
        groceryOrder = Map.of(
                "Яблоки (1 кг)", 2,
                "Молоко 1л", 3,
                "Хлеб пшеничный", 1,
                "Курица (1 кг)", 1,
                "Кола", 1
        );


        pizzaDelivery.createOrder(pizzaOrder);
        groceryDelivery.createOrder(groceryOrder);
        System.out.println(pizzaDelivery + "\n");
        System.out.println(groceryDelivery);


    }
}
