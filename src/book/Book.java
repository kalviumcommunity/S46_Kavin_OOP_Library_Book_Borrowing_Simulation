package book;

public class Book {
    private String bookName;
    private boolean isAvailable;

    public Book(String bookName) {
        this.bookName = bookName;
        this.isAvailable = true;
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
