package user;
import book.Book;
import book.BorrowedBook;
import utils.Logger;

import java.util.ArrayList;

public abstract class User {
    private String name;
    private ArrayList<BorrowedBook> borrowedBooks;

    protected final Logger LOGGER = new Logger();

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public abstract void borrowBook(Book book);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<BorrowedBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        StringBuilder borrowedBooksList = new StringBuilder();
        for (BorrowedBook book : borrowedBooks) {
            borrowedBooksList.append("\t").append(book.toString()).append("\n");
        }

        return "Name: " + this.getName() + "\nBorrowed books: \n" + borrowedBooksList.toString();
    }
}

