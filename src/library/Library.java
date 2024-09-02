package library;

import book.Book;
import user.Student;
import user.User;
import utils.Logger;

import java.util.ArrayList;

public class Library {
    private ArrayList<User> users;
    private ArrayList<Book> books;

    private final Logger LOGGER = new Logger();

    public Library() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addBook(String bookName) {
        Book newBook = new Book(bookName);
        books.add(newBook);
    }

    public void addUser(String userName) {
        User newUser = new Student(userName);
        users.add(newUser);
    }

    public Book searchBook(String bookName) {
        Book book = null;

        for (Book temp : books) {
            if (temp.getBookName().equals(bookName)) {
                book = temp;
            }
        }

        return book;
    }

    public User searchUser(String userName) {
        User user = null;

        for (User temp : users) {
            if (temp.getName().equals(userName)) {
                user = temp;
            }
        }

        return user;
    }

    public void borrowBook(String bookName, String userName) {
        User user = this.searchUser(userName);
        Book book = this.searchBook(bookName);

        if (user == null) {
            LOGGER.warn("There is no user named" + userName);
        }
        else if (book == null) {
            LOGGER.warn("There is no book named" + bookName );
        }
        else {
            user.borrowBook(book);
            System.out.println(user.getName() + " has borrowed " + book.getBookName());
        }
    }

    public static void getUserCount() {
        System.out.println("Total number of users enrolled in this library are: " + User.getUserCount());
    }

    public static void getBookCount() {
        System.out.println("Total number of books recorded in this library are: " + Book.getBookCount());
    }
}

