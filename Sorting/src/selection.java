import java.util.Scanner;

public class selection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("enter the numbers");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		arr[5] = sc.nextInt();
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[index]>arr[j])
					index=j;
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
			}
		}

	
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
