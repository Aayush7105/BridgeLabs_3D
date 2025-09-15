public class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge;
    private double discountPercentage;
    private double discountedAmount;

    public NonVegItem(String itemName, double price, int quantity, double extraCharge) {
        super(itemName, price, quantity);
        this.extraCharge = extraCharge;
        this.discountPercentage = 0.0;
        this.discountedAmount = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + extraCharge) * getQuantity();
        return total - discountedAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discountPercentage = percentage;
        this.discountedAmount = (getPrice() + extraCharge) * getQuantity() * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discountPercentage + "%, Amount: " + discountedAmount;
    }
}
