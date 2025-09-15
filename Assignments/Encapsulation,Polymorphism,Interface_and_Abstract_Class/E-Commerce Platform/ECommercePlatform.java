import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {

    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            product.displayProduct();

            double discount = product.calculateDiscount();
            double tax = 0.0;
            String taxDetails = "No tax applicable.";

            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
                taxDetails = taxable.getTaxDetails();
            }

            double finalPrice = product.getPrice() + tax - discount;

            System.out.println(taxDetails);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Smartphone", 30000, 0.18));
        products.add(new Clothing(102, "Jeans", 2000, 0.12));
        products.add(new Groceries(103, "Rice", 500));

        calculateFinalPrice(products);
    }
}
