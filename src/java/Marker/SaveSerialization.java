package Marker;
import java.io.*;

public class SaveSerialization implements Serializable{
    int i;
}
class MarkerSerialization {
    public static void main(String[]args)throws Exception{
        SaveSerialization s1 = new SaveSerialization();
        s1.i=10;
        //Creating a file object
        File f=new File("myfile.txt");
        //Creating a object to store values
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);

        System.out.println(s1.i);

    }
}
