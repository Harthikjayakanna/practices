package Challenge;

import java.util.Scanner;

public class AwesomeNum {
	static void Awesomenum(int num) {
		int temp=num;
		int count=0;
		while(num!=0) {
			int d=num%10;
			if(d==8) {
				count++;
			}
			num=num/10;
		}
		if(count>=3) {
			System.out.println(temp+" is the Awesome Number");
		}
		else
		{
			System.out.println(temp+" is not the Awesome Number");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int num=sc.nextInt();
	Awesomenum(num);
}
}
