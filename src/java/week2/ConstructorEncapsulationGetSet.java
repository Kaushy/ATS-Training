package week2;
 class ConstructorEncapsulationGetSet {
    private String title;
    private String author;
    private double price;

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

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public ConstructorEncapsulationGetSet(String title, String author, double price) {
        this.title=title;
        this.author=author;
        this.price=price;

    }
    public static void main(String[] args) {
         ConstructorEncapsulationGetSet obj = new ConstructorEncapsulationGetSet("Worlds Biggest love Story", "Kaushik", 100.0);
         System.out.println(obj.getTitle());
         System.out.println(obj.getAuthor());
         System.out.println(obj.getPrice());

    }
}
