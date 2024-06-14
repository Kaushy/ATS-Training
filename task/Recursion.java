/*public class Recursion {
    public static void main(String[] args) {
        int n=10;
        int sum = value(n);
        System.out.println(sum);
    }
    static int value(int n){
        if(n<3){
            return 0;
        }
        int sum = value(n-1);

        if(n%3==0){
            return sum+=n;
        }
        return sum;
       
            }

        }*/

/*public class Recursion {
    public static void main(String[] args) {
        int n=100;
        int sum = value(n);
        System.out.println(sum);
    }
    static int value(int n){
        if(n<3){
            return 0;
        }
        int sum = value(n-1);

        if(n%3==0){
            return sum+=n;
        }
        return sum;
       
            }

        }*/
import java.util.Scanner;
public class Recursion {
    public static void main(String[]args){
                
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num ");
        int n=sc.nextInt();
        System.out.println("Enter the dividing num ");
        int d=sc.nextInt();
        
        int sum=Value(n,d);
        //System.out.println("-----------------------");
        System.out.println(sum);
    }
        static int Value(int n,int d){
            if(n<d){
                return 0;
            }
                    if(n%d==0){
                        System.out.println(n);
                        return n + Value(n-1,d);
                        
                    }
                    else{
                        return Value(n-1,d);
                    }
                    
            }
            }
        
        
            