package practice6.DesignPatterns.FactoryMethod;

import java.util.Map;

public class PizzaDelivery extends DeliveryService {
    public PizzaDelivery() {
        super();
        setDeliveryName("Доставка пиццы");
    }

    @Override
    public void createOrder(Map<String, Integer> order) {
        setOrder(order);
    }
}
