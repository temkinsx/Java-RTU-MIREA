package practice6.DesignPatterns.FactoryMethod;

/*
Реализация порождающего паттерна Factory Method.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

abstract public class DeliveryService {
    private LocalDateTime orderDate;
    private String deliveryName;

    private Map<String, Double> stock = new LinkedHashMap<>();
    private final Map<String, Integer> order = new LinkedHashMap<>();
    private final ArrayList<String> notInStock = new ArrayList<>();


    public DeliveryService() {
    }

    abstract public void createOrder(Map<String, Integer> order);

    public Map<String, Double> getStock() {
        return stock;
    }

    public void setStock(Map<String, Double> stock) {
        this.stock = stock;
    }

    public Map<String, Integer> getOrder() {
        return order;
    }

    public void setOrder(Map<String, Integer> order) {
        notInStock.clear();
        this.order.clear();

        for (String item : order.keySet()) {
            if (stock.containsKey(item)) {
                this.order.put(item, order.get(item));
            } else {
                notInStock.add(item);
            }
        }
        this.orderDate = LocalDateTime.now();
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return orderDate.plusHours(2);
    }

    public double getTotalPrice() {
        double price = 0.0;
        for (String key : order.keySet()) {
            price += order.get(key) * stock.get(key);
        }
        return price;
    }

    public double getPrice(String good) {
        return stock.get(good);
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    //можно сделать public - тогда System.out.println(pizzdaDelivery.deliver());
    private String deliver() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder(deliveryName);
        sb.append(String.format("%nСоздан: %s%n", this.orderDate.format(formatter)));
        sb.append("Ваш заказ:\n");
        sb.append(String.format("%-20s %-12s %-10s%n", "Товар", "Количество", "Цена (в рублях)"));

        for (String item : order.keySet()) {
            Integer quantity = order.get(item);
            Double price = stock.get(item);

            sb.append(String.format("%-20s %-12d %-10.2f%n", item, quantity, price * quantity));
        }
        if (!notInStock.isEmpty()) {
            sb.append("\nВ наличии не было: ").append(String.join(", ", notInStock)).append("\n");
        }
        sb.append(String.format("\nИтог: %.2f рублей", getTotalPrice()));

        sb.append("\nДоставим за 2 часа");
        return sb.toString();
    }


    @Override
    public String toString() {
        return this.deliver();
    }
}
