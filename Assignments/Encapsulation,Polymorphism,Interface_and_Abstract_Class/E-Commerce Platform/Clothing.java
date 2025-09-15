public class Clothing extends Product implements Taxable {
    private double taxRate;

    public Clothing(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (taxRate * 100) + "%";
    }
}
