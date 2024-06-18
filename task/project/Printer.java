package project;

public class Printer {
    public static void display(Members[] m) {

        for (int i = 0; i < m.length; i++) {
            System.out.println("Details of Persons" + (i+1) + ":");
            System.out.println("Person Name: "+m[i].getName());
            System.out.println("Person Age: "+m[i].getAge());
            System.out.println("Special Id: "+m[i].getSpecialMember()+" " + (m[i].getSpecialMember()==1?true:false));
            System.out.println("Book Title name: "+ m[i].getTitle());
            System.out.println(" ");
        }
    }
}
