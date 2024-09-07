import java.util.Scanner;

public class Buble {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= new int[4];
	System.out.println("enter the numbers");
	arr[0]=sc.nextInt();
	arr[1]=sc.nextInt();
	arr[2]=sc.nextInt();
	arr[3]=sc.nextInt();
	int n=arr.length-1;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int a:arr) {
		System.out.print(a+ " ");
	}
}
}
