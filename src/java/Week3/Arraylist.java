package Week3;
import java.util.ArrayList;

class Arraylist implements ArrayInterface {
    ArrayList<String> student = new ArrayList<>();

    public void add() {
        System.out.println("Running from class Arraylist");
        student.add("kaushik");
        student.add("hari");
        student.add("gahan");
        for (String i : student) {
            System.out.println(i);
        }

    }

    public void remove() {
        System.out.println("Running from class Arraylist :");
        System.out.println("removing : " + student.remove(1));

    }

    public void search() {
        System.out.println("Running from class Arraylist :");
        System.out.println("Searching :" + student.get(0));

    }

    public void display() {
        System.out.println("Running from class Arraylist :");
        System.out.println("Remaining students after removing few students");
        for (String d : student) {
            System.out.println(d);

        }
    }
}
