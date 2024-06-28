package Week4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class MainEmployee {
    public static void main(String[] args) throws Exception {
        Employe es=new Employe("Kaushik",123,10000);
        Employe es1=new Employe("hari",234,30000);
        File f=new File("Employee.det");
        FileOutputStream fos= new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(es);
        oos.close();
        fos.close();
        System.out.println(es.getEmpName());
        System.out.println(es.getEmpID());
        System.out.println(es.getEmpSalary());
        System.out.println(es1.getEmpName()+" "+es1.getEmpID()+" "+es1.getEmpSalary());
    }

}
