package Saturday30;

import java.util.Scanner;

public class SumofArmstrongnumber {
	static Scanner sc=new Scanner(System.in);
	static int countdigit(int n) {
		int c=0;
		while(n>0) {
			c++;
		    n/=10;
		}
		return c;
	}
	static void armstrong(int n1,int n2) {
		int total=0;
		for(int i=n1;i<=n2;i++) 
		{
			int n=i;
			int power=countdigit(n);
			int temp=n;
			int sum=0;
			while(n>0) {
				int last=n%10;
				int powerednum=1;
				for(int k=1;k<=power;k++) {
					powerednum*=last;
				}
				sum+=powerednum;
				n/=10;
			}
			if(sum==temp) {
				System.out.print(sum+" ");
				total+=sum;
			}
		}
		System.out.println(" ");
		System.out.println("total of Armstrong number is "+ total);
	}
	public static void main(String[] args) {
		System.out.println("Enter the range for sum of armstrong number (2 number)");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		armstrong(n1,n2);
	}

}
