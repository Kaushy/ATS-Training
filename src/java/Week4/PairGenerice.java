package Week4;
import java.util.ArrayList;
public class PairGenerice<T> {
   T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
    public void show(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    }
    class Pair {
        public void main(String[] args) {
            PairGenerice<String> pg = new PairGenerice<>();
            pg.setName("Kaushik");
            System.out.println(pg.getName());
            ArrayList<String> list = new ArrayList<>();
            list.add("hari");
            list.add("gahan");
            pg.show(list);

        }
    }