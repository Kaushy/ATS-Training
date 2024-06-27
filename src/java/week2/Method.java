package week2;
//Finding Smallest number
public class Method {
    static int a=20;
    static int b=30;
    static int c=40;
    //calling method
   public static void myMethod() {
       if (a < b && a < c)
           System.out.println(a);
       else if (b < a && b < c)
           System.out.println(b);
       else
           System.out.println(c);
   }
    public static void main(String[] args) {
        myMethod();
    }
}
