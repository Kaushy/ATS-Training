package Week3.Library;
import java.util.TreeMap;

public class Library implements LibraryInterface {
    TreeMap<String, Book> books = new TreeMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }
    public void removeBook(String title) {
     books.values().removeIf(book -> book.title.equals(title));
    }

    public void searchBook(String titleName) {
        for (Book b: books.values()) {

            if(b.title.contains(titleName)){
                System.out.println(b);
            }else{
                System.out.println("book not found");
            }
        }
    }
    @Override
    public void searchGenre(String genreName) {

        for(Book i : books.values()) {
            if (EnumGenre.getEnum(genreName).equals(i.getGenre())) {
                System.out.println(i);
            }else{
                System.out.println("Genre not found");
            }
        }
        }
    public void getAllDettailsofBook() {
        if (books.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book i : books.values()) {
                System.out.println(i);
            }
        }
    }
}
