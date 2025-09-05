package practice6.DesignPatterns.FactoryMethod;

import java.util.Map;

public class GroceryDelivery extends DeliveryService {
    public GroceryDelivery() {
        super();
        setDeliveryName("Доставка продуктов");
    }

    @Override
    public void createOrder(Map<String, Integer> order) {
        setOrder(order);
    }
}
