
public class Ques5 {
    String brand;
    String model;
    double price;

    Ques5(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Ques5 mobile1 = new Ques5("VIVO", "VIVO V29", 15999);
        Ques5 mobile2 = new Ques5("ONE PLUS", "ONE PLUS Nord4", 39999);
        Ques5 mobile3 = new Ques5("APPLE", "iPhone Pro16", 79999);

        mobile1.displayMobile();
        mobile2.displayMobile();
        mobile3.displayMobile();
    }
}
