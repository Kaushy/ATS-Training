package week2;

class InheritsStudents extends InheritPerson {
    private String studentId;
    public String major;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public InheritsStudents(String name, String age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;

    }

    @Override
    public String getDetails() {
        return studentId + " "+ major;
    }

    public static void main(String[] args) {
        InheritsStudents is=new InheritsStudents("kaushik","23","19ee029","EEE");
        System.out.println(is.getName());
        System.out.println(is.getAge());
        System.out.println(is.getStudentId());
        System.out.println(is.getMajor());

    }

}
