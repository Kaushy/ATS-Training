package project;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating object for book
        //Main myObj=new Main();
        Book b = new Book();
        //creating object for book2
        Book b1 = new Book();
        b.setTitle("Effective Java");
        b.setPrice(150);
        b.setSerialNum(12345);
        b.setName("Joshua Bloch");
        b.setAge(52);
        //book 2
        b1.setTitle("Clean Code");
        b1.setPrice(100);
        b1.setSerialNum(12345);
        b1.setName("Robert C. Martin");
        b1.setAge(52);
//
       Printer p=new Printer();
        Members m = new Members();
        m.setName("Alice");
        m.setAge(25);
        m.setSpecialMember(0);
        m.setTitle("Effective Java");
        // creating objects for person 2
        Members m1 = new Members();
        m1.setName("Bob");
        m1.setAge(26);
        m1.setSpecialMember(1);
        m1.setTitle("Clean Code");
//        boolean var=m.getSpecialMember()==1?true:false;
//        boolean var1=m1.getSpecialMember()==0?true:false;

        while (true) {
            System.out.println("1.Details of  Books");
            System.out.println("2.Details of Members");
            System.out.println("3.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Details of book 1");
                    System.out.println("Title : " + b.getTitle());
                    System.out.println("Book Price: " + b.getPrice());
                    System.out.println("Book sno: " + b.getSerialNum());
                    System.out.println("Author name: " + b.getName());
                    System.out.println("Author Age: " + b.getAge());
                    System.out.println(" ");
                    System.out.println("Details of book 2");
                    System.out.println("Title : " + b1.getTitle());
                    System.out.println("Book Price: " + b1.getPrice());
                    System.out.println("Book sno: " + b1.getSerialNum());
                    System.out.println("Author name: " + b1.getName());
                    System.out.println("Author age: " + b1.getAge());
                    break;
                case 2:
//                    System.out.println("Details of members 1");
                    Members[] mem = {m, m1};
                    //System.out.println("Details of members 1");
                    p.display(mem);

                case 3:
                    System.out.println("Exit");
                    break;
            }

        }

    }
}


