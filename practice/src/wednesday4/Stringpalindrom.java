package wednesday4;

import java.util.Scanner;

public class Stringpalindrom {
	static Scanner sc =new Scanner(System.in);
	static void palindrome(String s1) {
		String dummy="";
		for(int i=s1.length()-1;i>=0;i--) {
			char ch=s1.charAt(i);
			
			dummy+=ch+"";
		}
		if(dummy.equals(s1)) 
			System.out.println("Its a palindrome");
		else
			System.out.println("Its not a palindrome");
	}
	public static void main(String[] args) {
		System.out.println("Enter the String to check its palindrom or not");
		String s1=sc.next();
		palindrome(s1);
	}

}
