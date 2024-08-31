import book.Book;
import library.Library;
import user.Student;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        for (int i = 0; i < 3; i++) {
            lib.addBook("book"+i);
        }

        lib.addUser("john");

        lib.borrowBook("book1", "john");
        System.out.println(lib.searchUser("john"));
    }
}
