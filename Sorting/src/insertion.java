import java.util.Scanner;

public class insertion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= new int[4];
	System.out.println("enter the numbers");
	arr[0]=sc.nextInt();
	arr[1]=sc.nextInt();
	arr[2]=sc.nextInt();
	arr[3]=sc.nextInt();
	int n=arr.length-1;
	for(int i=1;i<n;i++) {
		int k=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>k) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=k;
	}
	for(int a: arr) {
		System.out.print(a+" ");
	}
}
}
