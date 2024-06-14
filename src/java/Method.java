/*class Method{
    //finding the smmalest value
    static int smallest(int x,int y,int z){
        return Math.min(Math.min(x,y),z);
    }
    //storing the variable
    public static void main(String[] args) {
        int x=20;
        int y=30;
        int z=40;
        System.out.println(smallest(x,y,z));
        
    }
} */
/*class Method{
    static int avrage(int x, int y, int z){
        return(x+y+z)/3;
    }
    public static void main(String[]args){
        int x=10;
        int y=20;
        int z=30;   
        System.out.println(avrage(x, y, z));
    }
}*/
import java.util.Scanner;

class Method {
 
 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year");
        int year = sc.nextInt();

        System.out.println(is_LeapYear(year));
    }
 
 public static boolean is_LeapYear(int y)
    {
        if ((y % 4) == 0) {
            if ((y % 100) != 0 || ((y % 100 == 0) && (y % 400 == 0))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    }
}

