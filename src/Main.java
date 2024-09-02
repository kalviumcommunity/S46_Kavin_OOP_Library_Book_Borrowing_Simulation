import book.Book;
import user.Student;
import user.User;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");
        Book book3 = new Book("Book3");
        Book book4 = new Book("Book4");
        Book book5 = new Book("Book5");
        Book book6 = new Book("Book6");



        Student john = new Student("John");
        Student steve = new Student("Steve");
        john.borrowBook(book1);
        john.borrowBook(book2);
        john.borrowBook(book3);
        john.borrowBook(book4);
        john.borrowBook(book5);
        john.borrowBook(book6);

        steve.borrowBook(book1);

        System.out.println(john);
        System.out.println(steve);

        System.out.println("Total book count: " + Book.getBookCount());
        System.out.println("Total user count: " + User.getUserCount());
    }
}
