import java.util.Arrays;
import java.util.Scanner;

public class Add_or_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size ");
		int a=sc.nextInt();
		System.out.println("enter the array ");
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
//		int arr[]= {1,9,3,5,4,6,7,8,2};
		int temp[]=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				temp[count]=arr[i];
				count++;
			}	
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				temp[count]=arr[j];
				count++;
			}
		}
		for (int i : temp) {
			System.out.println(i);
		}
		
	}
}
