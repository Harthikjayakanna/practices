package Thursday5;

import java.util.Scanner;

public class LinearArraySeacrh {
	static Scanner sc=new Scanner(System.in);
	static boolean linearsearch(int arr[],int num) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter the 6 number for a array of number");
		int arr[]=new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j:arr) {
			System.out.print(j+" ");
		}
		System.out.println("Enter the number to be searched");
		int num=sc.nextInt();
		
		boolean n=linearsearch(arr,num);
		System.out.println(n);
	}
}
