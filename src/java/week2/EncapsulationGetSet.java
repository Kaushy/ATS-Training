package week2;

public class EncapsulationGetSet {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void main(String[] args) {
        EncapsulationGetSet e = new EncapsulationGetSet();
        //setting the values for attribute
        e.setTitle("myname");
        e.setAuthor("John Doe");
        e.setYear(2018);
      //getting values
        System.out.println(e.getTitle());
        System.out.println(e.getAuthor());
        System.out.println(e.getYear());
    }
}
