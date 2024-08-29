package user;
import book.Book;
import book.BorrowedBook;

import java.util.ArrayList;

public class Student extends User{
    private final int MAX_BOOKS_ALLOWED = 5;
    private final int MAX_BORROW_DURATION = 10;

    public Student(String name) {
        super(name);
    }

    @Override
    public void borrowBook(Book book) {
        ArrayList<BorrowedBook> borrowedBooks = super.getBorrowedBooks();

        if ((borrowedBooks.size() == MAX_BOOKS_ALLOWED)) {
            super.LOGGER.warn("The user has reached the borrowing limit !! Return some books before borrowing");
        }
        else if (!book.isAvailable()) {
            super.LOGGER.warn("The book is not available !! Someone has already borrowed it");
        }
        else {
            book.changeAvailable();
            BorrowedBook newBook = new BorrowedBook(book, MAX_BORROW_DURATION);
            borrowedBooks.add(newBook);
            super.setBorrowedBooks(borrowedBooks);
        }
    }

    public int getMAX_BOOKS_ALLOWED() {
        return MAX_BOOKS_ALLOWED;
    }

    public int getMAX_BORROW_DURATION() {
        return MAX_BORROW_DURATION;
    }
}

