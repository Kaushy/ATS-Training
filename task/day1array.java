import java.util.Scanner;
class day1array{
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int size=sc.nextInt();
	int[] arr=new int[size];
	System.out.print("Enter the element to be Stored:");
	for (int i = 0; i <size; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
	for(int j=size-1;j>=0;j--) {
		System.out.print(arr[j]);
	}
}
}
