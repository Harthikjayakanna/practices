package wednesday4;

import java.util.Scanner;

public class Binaryarray {
	static Scanner sc =new Scanner(System.in);
	static void binarysort(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i<count) {
				arr[i]=0;
			}
			else
				arr[i]=1;
		}
		for(int i: arr)
			System.out.println(i);
	}
	public static void main(String[] args) {
		System.out.println("Enter the 5 binary value");
		int arr[]= new int[5];
		for(int n=0;n<5;n++) {
			arr[n]=sc.nextInt();
		}
		binarysort(arr);
	}

}
