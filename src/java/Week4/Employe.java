package Week4;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employe implements Externalizable {
    private String empName;
    private int empID;
    private double empSalary;

    public Employe() {

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(empName);
        out.writeInt(empID);
        out.writeDouble(empSalary);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        empName = in.readUTF();
        empID = in.readInt();
        empSalary = in.readDouble();

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public Employe(String empName, int empID, double empSalary) {
        this.empName = empName;
        this.empID = empID;
        this.empSalary = empSalary;


    }

}
