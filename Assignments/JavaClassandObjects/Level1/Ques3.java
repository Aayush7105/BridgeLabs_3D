
public class Ques3 {
    String bookTitle;
    String bookAuthor;
    double price;

    Ques3(String bookTitle, String bookAuthor, double price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title of the book: " + bookTitle);
        System.out.println("Author of the book: " + bookAuthor);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Ques3 book1 = new Ques3("2States", "Chetan Bhagat", 500);
        Ques3 book2 = new Ques3("Wings Of Fire", "Abdul Kalam A.P.J", 500);
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
