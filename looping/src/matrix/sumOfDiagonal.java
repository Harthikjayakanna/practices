package matrix;

import java.util.Scanner;

public class sumOfDiagonal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of rows");
	int row=sc.nextInt();
	System.out.println("enter the no of coloumn");
	int column =sc.nextInt();
	int arr[][]=new int [row][column];
	System.out.println("enter the "+row*column+" no of data to create the array");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			arr[i][j]=sc.nextInt();
		}
		System.out.println( );
	}
	int sum=0;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			if(i==j) {
				sum+=arr[i][j];
			}
		}
	}
	System.out.println("sum of the diagnal is "+ sum);
}
}
