package Challenge;

import java.util.Scanner;

public class DuckNum {
	static void checkduck(int num) {
		int temp=num;
		int count=0;
		while(num!=0) {
			int d=num%10;
			if(d==0) {
				count++;
			}
			num=num/10;
		}
		if(count>0) {
			System.out.println(temp +" is the duck number");
		}
		else
		{
			System.out.println(temp+" is not a duck number");
		}
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	checkduck(num);
}
}
