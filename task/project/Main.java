package project;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating object for book
        Book b=new Book();
        //creating object for book2
        Book b1=new Book();
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
        //creating objects for person1
        Members m=new Members();
        m.setName("Alice");
        m.setAge(25);
        m.setSpecialMember(1);
        m.setTitle("Effective Java");
        //creating objects for person 2
        Members m1=new Members();
        m1.setName("Bob");
        m1.setAge(26);
        m1.setSpecialMember(0);
        m1.setTitle("Clean Code");


        while(true){
            System.out.println("1.Details of  Books");
            System.out.println("2.Details of Members");
            System.out.println("3.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Details of book 1");
                    System.out.println("Title : "+b.getTitle());
                    System.out.println("Book Price: "+b.getPrice());
                    System.out.println("Book sno: "+b.getSerialNum());
                    System.out.println("Author name: "+b.getName());
                    System.out.println("Author Age: "+b.getAge());
                    System.out.println(" ");
                    System.out.println("Details of book 2");
                    System.out.println("Title : "+b1.getTitle());
                    System.out.println("Book Price: "+b1.getPrice());
                    System.out.println("Book sno: "+b1.getSerialNum());
                    System.out.println("Author name: "+b1.getName());
                    System.out.println("Author age: "+b1.getAge());
                    break;
                case 2:
                    System.out.println("Details of person1");
                    System.out.println("Person Name: "+m.getName());
                    System.out.println("Person age: "+m.getAge());
                    System.out.println("Special Member: "+m.getSpecialMember());
                    System.out.println("Title: "+m.getTitle());
                    specialDiscount(m,b);
                    System.out.println(" ");
                    System.out.println("Details of person2");
                    System.out.println("Person Nmae: "+m1.getName());
                    System.out.println("Person Age: "+m1.getAge());
                    System.out.println("Special member: " + m1.getSpecialMember());
                    System.out.println("Title : "+m1.getTitle());
                    specialDiscount(m1,b1);
                case 3:
                    System.out.println("Exit");
                    break;
            }

        }

    }

    private static void specialDiscount(Members m, Book b ) {

        if(m.getSpecialMember()==1){
            double Discount= b.getPrice() * 0.20;
            double SpecialDiscount= b.getPrice()-Discount;
            System.out.println("SpecialDiscount applied for "+m.getName()+" your Book Price is "+b.getPrice()+" = "+"Discount offer is 20% After Specialdiscount your book price is "+SpecialDiscount);
        }
        else{
            System.out.println("Sorry Bop : Discount not applied ");
        }
//        public static void specialDiscount(Members m1,Book b1){
//        if(m1.getSpecialMember()==1){
//            double Discount= b1.getPrice() * 0.20;
//            double SpecialDiscount= b1.getPrice()-Discount;
//            System.out.println("SpecialDiscount: "+SpecialDiscount);
////        }
//        else{
//            System.out.println(" Sorry Discount not applied ");
//        }
    }
}


