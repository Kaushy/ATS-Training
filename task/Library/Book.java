package Library;
import java.util.Objects;
    public class Book {
    String title;
    String author;
    String isbn;
    EnumGenre genre;

        public Book(String title, String author, String isbn, EnumGenre genre) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.genre = genre;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public EnumGenre getGenre() {
            return genre;
        }

        public void setGenre(EnumGenre genre) {
            this.genre = genre;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Book book)) return false;
            return Objects.equals(title, book.title);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(title);
        }




    public Book() {
    }

    public String toString() {
        return title + " " + author + " " + isbn + " " + genre;
    }
}