package Thursday5;

import java.util.Scanner;

public class insertionsort {
	static Scanner sc=new Scanner(System.in);
	static void insertionsort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int val=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>val) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=val;
		}
		for(int j:arr) {
			System.out.print(j+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the 6 number for a array of number");
		int arr[]=new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		insertionsort(arr);
	}

}
