package Thursday5;

import java.util.Scanner;

public class BinearySearch {
	static Scanner sc=new Scanner(System.in);
	static boolean binearysearch(int arr[],int num) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(num==arr[mid]) {
				return true;
			}
			else if(num>arr[mid]) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter the 6 integer value in the array");
		int arr[]=new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j :arr) {
			System.out.print(j+ " ");
		}
		System.out.println("");
		System.out.println("Enter the number needed to be search");
		int num=sc.nextInt();
		boolean n=binearysearch(arr,num);
		System.out.println(n);
	}

}
