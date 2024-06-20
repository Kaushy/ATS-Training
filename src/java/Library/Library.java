package Library;
import java.util.TreeMap;

public class Library implements LibraryInterface {
    TreeMap<String, Book> books = new TreeMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void removeBook(String isbn) {
     books.values().removeIf(book -> book.isbn.equals(isbn));
    }

    public Book searchBook(String Title) {
        System.out.println("Searching for book....." + Title);
        System.out.println(books.get(Title)+" is present in the book list");
        return books.get(Title);
    }

    public void getAllDettailsofBook() {
        for (Book i: books.values()) {
            System.out.println(i);
        }
    }

}
