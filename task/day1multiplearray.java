import java.util.Scanner;
class day1multiplearray{
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");

	//input from user for size of array
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] arr=new int[r][c];
	System.out.print("Enter the element to be Stored");

	//Taking input from user for rows and column
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