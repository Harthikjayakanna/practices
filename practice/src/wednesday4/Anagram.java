package wednesday4;

import java.util.Scanner;

public class Anagram {
	static Scanner sc=new Scanner(System.in);
	static void check(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			System.out.println("Not a Anagram");
			return;
		}
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)==-1) {
				System.out.println("Not a Anagram");
				return;
			}	
		}
		System.out.println("It is a anagram");
	}
	public static void main(String[] args) {
		System.out.println("Enter two String values to find the anagram or not");
		String s1=sc.next();
		String s2=sc.next();
		check(s1,s2);
	}

}
