import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        Book book = new Book("B001", "Java Programming", "Author A");
        Magazine magazine = new Magazine("M001", "Tech Monthly", "Author B");
        DVD dvd = new DVD("D001", "Inception", "Director C");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("John Doe");
                System.out.println("Available after reservation: " + reservable.checkAvailability());
                if (item instanceof Book) {
                    System.out.println("Borrower: " + ((Book) item).getBorrowerName());
                } else if (item instanceof Magazine) {
                    System.out.println("Borrower: " + ((Magazine) item).getBorrowerName());
                } else if (item instanceof DVD) {
                    System.out.println("Borrower: " + ((DVD) item).getBorrowerName());
                }
            }

            System.out.println("----------------------------");
        }
    }
}
