import java.util.Date;

class Patron {
    private String patronName;
    private int patronId;

    public Patron(String name, int id) {
        patronName = name;
        patronId = id;
    }

    public String getPatronName() {
        return patronName;
    }

    public int getPatronId() {
        return patronId;
    }
}

class Book {
    private String bookTitle;
    private String author;
    private boolean isCheckedOut;

    public Book(String title, String author) {
        bookTitle = title;
        this.author = author;
        isCheckedOut = false;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void checkIn() {
        isCheckedOut = false;
    }
}

class Checkout {
    private Patron patron;
    private Book book;
    private Date checkoutDate;
    private Date dueDate;
    private double fineAmount;

    public Checkout(Patron patron, Book book, Date checkoutDate, Date dueDate) {
        this.patron = patron;
        this.book = book;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        fineAmount = 0.0;
    }

    public Patron getPatron() {
        return patron;
    }

    public Book getBook() {
        return book;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    // Methods and attributes related to the checkout process...
}

public class AssociationClass {
    public static void main(String[] args) {
        // Create patrons and books
        Patron patron1 = new Patron("Alice", 101);
        Patron patron2 = new Patron("Bob", 102);

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Perform checkouts
        Checkout checkout1 = new Checkout(patron1, book1, new Date(), new Date());
        Checkout checkout2 = new Checkout(patron2, book2, new Date(), new Date());

        // Simulate returning a book and calculating fines
        checkout1.setFineAmount(5.0);

        // Access and print library information
        System.out.println("Patron: " + checkout1.getPatron().getPatronName() +
                " checked out '" + checkout1.getBook().getBookTitle() + "'.");
        System.out.println("Fine for " + checkout1.getPatron().getPatronName() +
                ": $" + checkout1.getFineAmount());
    }
}
