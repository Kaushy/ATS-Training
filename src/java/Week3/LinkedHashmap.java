package Week3;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
    public static void main(String[] args) {
        //adding the names
        Map<Integer, String> l = new LinkedHashMap<>();
        l.put(1, "Arvind");
        l.put(3, "Charan");
        l.put(4, "Dinesh");
        l.put(2, "Bala");
        l.put(5, "Elen");
        // Insertion order
        for(Map.Entry<Integer, String> entry : l.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }

        System.out.println();
        //updating the 4th element
        l.put(4,"Vicky");
        for(Map.Entry<Integer, String> entry : l.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
        System.out.println();
        //Removing the 5th Element
        l.remove(5);
        System.out.println("After removing 5 elements");
        for(Map.Entry<Integer, String> entry : l.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());

        }
    }
}
