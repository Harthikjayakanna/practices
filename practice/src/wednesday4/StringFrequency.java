package wednesday4;

import java.util.Scanner;

public class StringFrequency {
	static Scanner sc =new Scanner(System.in);
	static void frequency(String s1) {
		String temp="";
		String s2=s1.toUpperCase();
		for(int i=0;i<s1.length();i++) {
			int c=0;
			char ch=s2.charAt(i);
			if(temp.indexOf(ch)==-1 && ch>=65 && ch<=90) {
				for(int j=0;j<s1.length();j++) {
					char che=s2.charAt(j);
							if(ch==che) {
								c++; }
							
				                      }
				temp+=ch;
				System.out.println(ch + " : "+ c);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		frequency(s1);
	}

}
