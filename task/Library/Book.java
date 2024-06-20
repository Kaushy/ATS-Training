package Library;

import java.util.Objects;

//import java.util.Iterator;
    enum Genre{
        Science,Social,Maths,Chemistry;
    }
    public class Book {
    String title;
    String author;
    String isbn;
    Genre genre;

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Book books))return false;
            return Objects.equals(isbn,books.isbn);
            }

        public int hashCode() {
            return Objects.hashCode(isbn);
        }

        public Book(String title, String author, String isbn, Genre genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
    }

    public Book() {
    }

    public String toString() {
        return title + " " + author + " " + isbn + " " + genre;
    }
}