package Week3;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Collection;
public class CollectionSort {
    public static void main(String[]args){
        LinkedList<Integer> number=new LinkedList<>();
        number.add(10);
        number.add(21);
        number.add(13);
        number.add(138);
        number.add(12);
        number.add(15);
        number.add(18);
        //sorting in acceding order
        Collections.sort(number);
        for(Integer n:number){
            System.out.println(n);
        }
        System.out.println();
        //Sorting in reverse order
        Collections.sort(number,Collections.reverseOrder());
        //iteration
        for(Integer n:number){
            System.out.println(n);
        }


    }
}
