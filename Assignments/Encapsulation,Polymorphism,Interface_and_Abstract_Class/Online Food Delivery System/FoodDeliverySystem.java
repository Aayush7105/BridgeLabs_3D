import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        vegItem.applyDiscount(10);

        NonVegItem nonVegItem = new NonVegItem("Chicken Curry", 250, 1, 50);
        nonVegItem.applyDiscount(5);

        order.add(vegItem);
        order.add(nonVegItem);

        processOrder(order);
    }

    public static void processOrder(List<FoodItem> order) {
        System.out.println("Order Details:\n");

        for (FoodItem item : order) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
            }

            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("----------------------------");
        }
    }
}
