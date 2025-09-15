public class VegItem extends FoodItem implements Discountable {
    private double discountPercentage;
    private double discountedAmount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercentage = 0.0;
        this.discountedAmount = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - discountedAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discountPercentage = percentage;
        this.discountedAmount = getPrice() * getQuantity() * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discountPercentage + "%, Amount: " + discountedAmount;
    }
}
