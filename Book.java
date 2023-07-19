public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        title = bookTitle;
        borrowed = false;
    }

    // Marks the book as rented
    public void borrowed() {
        borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return borrowed;
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("Women in Tech");
        System.out.println("Women in Tech): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
