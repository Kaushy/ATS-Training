package Week3;
import java.util.LinkedList;
class ArraylistImp implements ArrayInterface {
    LinkedList<Integer> l = new LinkedList<>();
    public void add() {
        System.out.println("Running from ArraylistImp :");
        l.add(10);
        l.add(20);
        l.add(30);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
    public void remove() {
        System.out.println("Running from ArraylistImp :");
        System.out.println("removing : "+l.remove(1));

    }
    public void search() {
        System.out.println("Running from ArraylistImp :");
        System.out.println("Searching :"+l.get(2));

    }
    public void display() {
        System.out.println("Running from ArraylistImp :");
        System.out.println("Remaining students after removing few students:");
        for (Integer a : l) {
            System.out.println(a);

        }

    }
}
