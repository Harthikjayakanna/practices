package Challenge;

import java.util.Scanner;

public class lucky_worker {
	static int add(int n) {
		int ad=0;
		int loop=4;
		for(int i=0;i<=loop-1;i++) {
			int g=n%10;
			ad=ad+g;
			n=n/10;
		}
		return ad;
	}
	static void PrimeNum(int sum){
		int count=0;
		System.out.println(sum);
		for(int i=1;i<=sum;i++) {
			if(sum%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("He is the lucky worker, he will get hike");
			
}
		else {
			System.out.println("He is normal one");
		}
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the 6 digit number employee id");
	int n=sc.nextInt();
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int n4=sc.nextInt();
	int x[]= {n,n1,n2,n3,n4};
	for(int s:x) {
	int sum=add(s);
	PrimeNum(sum);}
}
}
