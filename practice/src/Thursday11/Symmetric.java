package Thursday11;

import java.util.Scanner;

public class Symmetric {
	static Scanner sc=new Scanner(System.in);
	static void Symentric(String s1) {
		int m=s1.length();
		int n=s1.length()/2;
			String firsthalf="";
			String secondhalf="";
			for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(i);
				if(m%2==0) {
					if(i<n) {
						firsthalf+=ch;
					}
					else
						secondhalf+=ch;
				}
				else {
					if(i<n) {
						firsthalf+=ch;
					}
					else if(i>n)
						secondhalf+=ch;
				}
			}
			if(firsthalf.equals(secondhalf)) {
				System.out.println("It is a symentric");
				return;
			}
			else
				System.out.println("It is not a Symentric");
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s1=sc.next();
		Symentric(s1);
		
	}

}
