import java.util.Scanner;
public class Recursive {
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

