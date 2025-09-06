package practice6.DesignPatterns.Builder;

public class Order {
    private final String mainCourse;
    private final String sideDish;
    private final String drink;
    private final String dessert;

    private Order(OrderBuilder builder) {
        this.mainCourse = builder.mainCourse;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ваш заказ:\n");
        if (mainCourse != null) sb.append(String.format("Главное блюдо: %s\n", mainCourse));
        if (sideDish != null) sb.append(String.format("Второе блюдо: %s\n", sideDish));
        if (drink != null) sb.append(String.format("Напиток: %s\n", drink));
        if (dessert != null) sb.append(String.format("Десерт: %s\n", dessert));
        return sb.toString();
    }

    public static class OrderBuilder {
        private String mainCourse;
        private String sideDish;
        private String drink;
        private String dessert;

        public OrderBuilder setMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public OrderBuilder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public OrderBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public OrderBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
