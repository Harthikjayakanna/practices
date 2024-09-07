package matrix;

import java.util.Scanner;

public class SumofRows {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of Rows");
	int row=sc.nextInt();
	System.out.println("enter the no of colums");
	int column=sc.nextInt();
	int arr[][]=new int [row][column];
	System.out.println("Enter the "+row*column+" no of data");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			arr[i][j]=sc.nextInt();
		}
		System.out.println( );
	}
	for(int i=0;i<=arr.length-1;i++) {
		int sum=0;
		for(int j=0;j<=arr[i].length-1;j++) {
			sum+=arr[i][j];
		}
		System.out.println("sum of row "+ (i+1)+ "is "+sum);
	}
	
	
}
}
