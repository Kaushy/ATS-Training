package project;
public class Book extends Author{
    private String title;
    private int price;
    private int SerialNum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSerialNum() {
        return SerialNum;
    }

    public void setSerialNum(int serialNum) {
        SerialNum = serialNum;
   }
    public Book(String title, int price, int serialNum) {
        this.title = title;
        this.price = price;
        this.SerialNum = serialNum;
    }
    public Book() {

    }
}
