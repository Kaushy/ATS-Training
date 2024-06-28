package Week3.Library;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        LibraryInterface l = new Library();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1.Create a new book");
            System.out.println("2.Show all books");
            System.out.println("3.Delete a book");
            System.out.println("4.Searching the book");
            System.out.println("5.Search by Genre");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter title");
                    String title = sc.next();
                    System.out.println("Enter author");
                    String author = sc.next();
                    System.out.println("Enter isbn");
                    String isbn = sc.next();
                        System.out.println("Select the genre: SCIENCE,SOCIAL,MATHS");
                        String genre = sc.next();

                    if(EnumGenre.getEnum(genre) != null) {
                        Book book1 = new Book(title, author, isbn, EnumGenre.getEnum(genre));
                        l.addBook(book1);
                    }
                    else{
                        System.out.println("invalid genre value");
                    }
                    break;
                case 2:
                    l.getAllDettailsofBook();
                    break;

                case 3:
                    System.out.println("Enter title name of book");
                    String Title = sc.next();
                    l.removeBook(Title);
                    System.out.println("book deleted successfully");
                    break;
                case 4:
                    System.out.println("Enter title of book");
                    String titleName = sc.next();
                    l.searchBook(titleName);
                    break;
                case 5:
                    System.out.println("Enter genre of book");
                    String genreName = sc.next();
                    l.searchGenre(genreName);
                    break;
                default:
                    System.out.println("invalid choice");

            }
        }


    }
}
