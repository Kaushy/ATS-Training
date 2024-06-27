package Week3;
import java.util.ArrayList;

class Arraylist implements ArrayInterface{
    ArrayList <String> student=new ArrayList<>();

    public void add() {
        student.add("kaushik");
        student.add("hari");
        student.add("gahan");
        for(String i : student){
            System.out.println(i);
        }

    }

    public void remove() {
        System.out.println("removing : "+student.remove(1));

    }

    public void search() {
        System.out.println("Searching :"+student.get(0));

    }
    public void display() {
        for (String d : student) {
            System.out.println("Remaining students after removing few students:"+d);

        }
    }

    public static void main(String[]args){
        Arraylist arr=new Arraylist();
        arr.add();
        arr.remove();
        arr.search();
        arr.display();
        }
    }
