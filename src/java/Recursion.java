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
public class Recursion {
    public static void main(String[] args) {
        int n=100;
        int sum = value(n);
        System.out.println(sum);
    }
    static int value(int n){
        if(n<5){
            return 0;
        }

        int sum = value(n-1);

        if(n%5==0){
            return sum+=n;
        }
        return sum;
       
            }

        }
    