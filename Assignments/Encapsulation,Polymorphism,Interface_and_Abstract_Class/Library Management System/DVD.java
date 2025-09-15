public class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrowerName;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 14; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.isAvailable = false;
            this.borrowerName = borrowerName;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
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
