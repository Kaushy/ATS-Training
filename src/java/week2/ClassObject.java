package week2;

class ClassObject {
     String title ;
     String AuthorName ;
     double price ;

    public ClassObject() {
        title="MyName";
        AuthorName="kaushik";
        price=100;
    }

    public static void main(String[] args) {
        ClassObject c = new ClassObject();
        System.out.println(c.title+" "+c.AuthorName+" "+c.price);
    }
}
