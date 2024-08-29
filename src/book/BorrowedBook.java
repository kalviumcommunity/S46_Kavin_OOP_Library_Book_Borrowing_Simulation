package book;

import java.time.LocalDate;

public class BorrowedBook {
    private Book book;
    private LocalDate dueDate;

    public BorrowedBook(Book book, int dueDate) {
        this.book = book;
        this.dueDate = LocalDate.now().plusDays(dueDate);
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }


    @Override
    public String toString() {
        return "Book name: " + this.getBook().getBookName() + "\tDue Date: " + this.getDueDate();
    }
}
