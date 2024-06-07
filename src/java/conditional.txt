/*import java.util.Scanner;
class Conditional {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=input.nextInt();
        if (i>0)
        System.out.println("Number is positive");
        else if (i<0)
            System.out.println("number is negative");
        
        else
        System.out.println("number is zero");
    }
    
} */


/* class Conditional{
    public static void main(String[] args) {
        int a=78;
        int b=25;
        int c=87;
        if(a>b)
        if(a>c)
        System.out.println("Greatest num is"+a);
        if(b>a)
        if(b>c)
        System.out.println("Greatest num is"+b);
        if(c>a)
        if(c>b)
        System.out.println("Greatest num is"+c);
        
    }
}*/

class Conditional {    
  public static void main(String[] args)
    {
        double x = 1000;
        double y = 1000;
        x = Math.round(x * 1000);
        x = x / 1000;
        y = Math.round(y * 1000);
        y = y / 1000;
        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}

/*import java.util.Scanner;
  class Conditional{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a =n;
        if(a/2==0&&a<=5)
        System.out.println("Not Weird");
        else if(a>20)
        System.out.println("Not Weird");
        else
        System.out.println("Weird");
        if(a<=20&&a>=6)
        System.out.println("Weird");

    }
  }*/
