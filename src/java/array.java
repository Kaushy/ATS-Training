/*class Array {
    public static void main(String[] args) {   

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println(average); 
    }
}*/

/*package JAVA;

public class Demo {
    public static void main(String[] args) {  
    	int[] arr= {10,1323,45,332,23};
    int max = arr[0];
    for(int i=1;i<arr.length;i++) {
    	if(arr[i]>max)
    		max = arr[i];
    }
    System.out.println(max);
    
    }
    }*/

    /*package ARRAY;

public class arraymulti {
	public static void main(String[]args) {
		int[][] mat= {{1234},{5678},{9123}};
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				System.out.println(mat[i][j]);
		}
	}

}
*/
/*import java.util.Scanner;
class array{
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int Size=sc.nextInt();
	int[] arr=new int[Size];
	System.out.print("Enter the element to be Stored");
	for (int i = 0; i <Size; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<Size;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
	for(int j=Size-1;j>=0;j--) {
		System.out.print(arr[j]);
	}
}
}
 */
import java.util.Scanner;
class array{
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] arr=new int[r][c];
	System.out.print("Enter the element to be Stored");
	for (int i = 0; i<r; i++) {
		for(int j=0;j<c;j++)
		arr[i][j]= sc.nextInt();
	}
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++){
		System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	

	for(int i=0;i<r;i++){
	for(int j=c-1;j>=0;j--) {
		System.out.print(arr[i][j]);
	}
	System.out.println();
}
	}
}