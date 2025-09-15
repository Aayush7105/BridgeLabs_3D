public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrowerName;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 21; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.isAvailable = false;
            this.borrowerName = borrowerName;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
    public String getBorrowerName() {
        return isAvailable ? "No borrower." : borrowerName;
    }
}
