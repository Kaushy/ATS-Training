package Library;

public class Main {
    public static void main(String[] args) {
        LibraryInterface l = new Library();
        Book book1=new Book("Plant","Dhivya","123", Genre.Science);
        Book book2=new Book("History","Dharani","456", Genre.Social);
        Book book3=new Book("Addition","Pradeep","789",Genre.Maths);
        System.out.println("Details of Books1");
        System.out.println("Title: "+book1.title);
        System.out.println("Author: "+book1.author);
        System.out.println("Isbn: "+book1.isbn);
        System.out.println("Genre: "+book1.genre);
        System.out.println();
        System.out.println("Details of Books 2");
        System.out.println("Title: "+book2.title);
        System.out.println("Author: "+book2.author);
        System.out.println("Isbn: "+book2.isbn);
        System.out.println("Genre: "+book2.genre);
        System.out.println();
        System.out.println("Details of Books3");
        System.out.println("Title: "+book3.title);
        System.out.println("Author: "+book3.author);
        System.out.println("Isbn: "+book3.isbn);
        System.out.println("Genre: "+book3.genre);

        l.addBook(book1);
        l.addBook(book2);
        l.addBook(book3);
        System.out.println();
        l.removeBook(book2.isbn);
        l.searchBook(book1.title);
        System.out.println();
        System.out.println("Remaining Books");
        l.getAllDettailsofBook();


    }
}
