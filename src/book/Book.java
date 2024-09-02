package book;

public class Book {
    private String bookName;
    private boolean isAvailable;

    private static int bookCount = 0;

    public Book(String bookName) {
        this.bookName = bookName;
        this.isAvailable = true;
        bookCount++;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public void changeAvailable() {
        this.isAvailable = !this.isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "book.Book Name: " + this.getBookName() + ", Available: " + (this.isAvailable() ? "Yes" : "No");
    }
}
