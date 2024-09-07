package Thursday5;

import java.util.Scanner;

public class changeUpperCase {
	static Scanner sc=new Scanner(System.in);
	static void convert(String sen) {
		String newsen="";
		for(int i=0;i<sen.length();i++) {
			char ch=sen.charAt(i);
			if(ch>96 && ch<123) {
				char che =(char)(ch-32);
				newsen+=che;
			}
			else
				newsen+=ch;
		}
		System.out.println(newsen);
	}
	public static void main(String[] args) {
		System.out.println("Enter the sentence");
		String sentence=sc.nextLine();
		convert(sentence);
	}

}
