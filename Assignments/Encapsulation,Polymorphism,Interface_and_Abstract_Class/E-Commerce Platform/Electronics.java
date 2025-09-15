public class Electronics extends Product implements Taxable {
    private double taxRate;

    public Electronics(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: " + (taxRate * 100) + "%";
    }
}
