package Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueStudent {
	static void FindUnique(int id) {
		int temp=id;
		int fac=1;
		int sum=0;
		while(id!=0) {
			int d=id%10;
			
			for(int i=1;i<=d;i++) {
				fac=d*i;
				
				sum+=fac;
			}
			id=id/10;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println(temp+" is the Lucky student");
		}
		else {
			System.out.println(temp+" is the normal one");
		}
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Student id");
	int id1=sc.nextInt();
	int id2=sc.nextInt();
	int id3=sc.nextInt();
	int id4=sc.nextInt();
	int id5=sc.nextInt();
	int x[]= {id1,id2,id3,id4,id5};
	for(int i:x) {
	FindUnique(i);}
}
}
