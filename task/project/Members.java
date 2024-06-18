package project;

public class Members extends Book{
    private String name;
    private int age;
    public int specialMember;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpecialMember() {
        return specialMember;
    }

    public void setSpecialMember(int specialMember) {
        this.specialMember = specialMember;
    }

    public Members(String name, int age, int specialMember) {
        this.name = name;
        this.age = age;
        this.specialMember = specialMember;
    }

    public Members() {

    }
}