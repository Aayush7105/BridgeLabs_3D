
public class Ques4 {
    String[] itemCode;
    String[] itemName;
    double[] price;

    Ques4(String[] itemName, String[] itemCode, double[] price) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
    }

    public void displayItems(int i) {
        System.out.println("Item Code: " + itemCode[i]);
        System.out.println("Item Name: " + itemName[i]);
        System.out.println("Item Price: " + price[i]);
    }

    public static void main(String[] args) {
        String[] itemName = {"Water bottle", "Rice", "Blackboard"};
        String[] itemCode = {"01AA", "01BB", "02AA"};
        double[] price = {500, 700, 400};

        Ques4 inventory = new Ques4(itemName, itemCode, price);
        for (int i = 0; i < price.length; i++) {
            inventory.displayItems(i);
        }
    }
}
