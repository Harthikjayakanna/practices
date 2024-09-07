package matrix;

import java.util.Scanner;

public class sum {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int sum=0;
	System.out.println("enter the no of rows");
	int row= sc.nextInt();
	System.out.println("enter no of columns");
	int column=sc.nextInt();
	int arr[][]=new int [row][column];
	System.out.println("Enter "+row*column+" no of data");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			 arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			sum+=arr[i][j];
		}
	}
	System.out.println("Total value of data is "+sum);
	
}
}
