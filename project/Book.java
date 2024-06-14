package project;
import java.util.Scanner;
public class Book{
    Book(){
        Scanner b=new Scanner(System.in);
        System.out.println("enter the title");
        String title=b.nextLine();
        System.out.println(title);
    }
}