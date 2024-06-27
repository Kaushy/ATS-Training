package Week3;
import java.util.HashMap;

class Hashmap implements HashMapInterface {
    HashMap<String,Integer> h = new HashMap<>();

    public void add(String key, int value) {
        h.put(key, value);
        }

    public void remove(String key) {
        System.out.println("removing : "+h.remove(key));
    }

    public void search(String key) {
        System.out.println("Searching :"+h.get(key));

    }

    public void display() {
        for (String d : h.keySet()) {
            System.out.println("Remaining students after removing few students:");
            System.out.println(d + " : " + h.get(d));

    }
}


    public static void main(String[]args){
        Hashmap hm=new Hashmap();
        hm.add("hari",23);
        hm.add("Kaushik",25);
        hm.add("gahan",31);
        hm.remove("hari");
        hm.search("gahan");
        hm.display();
    }
}
