package week2;

public class InheritPerson {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public InheritPerson(String name, String age) {
        this.name = name;
        this.age = age;

    }
    public String getDetails(){
        return "Name: " + name + " Age: " + age;
    }

}
