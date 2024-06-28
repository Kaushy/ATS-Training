package Week4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class MarkerSerialization {
    public static void main(String[] args) throws Exception {
        Serialization s1 = new Serialization();
        s1.i = 10;
        //Creating a file object
        File f = new File("myfile.txt");
        //Creating a object to store values
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);

        System.out.println(s1.i);

    }
}
