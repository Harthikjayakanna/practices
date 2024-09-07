package Thursday5;

import java.util.Scanner;

public class CountVowels {
	static Scanner sc=new Scanner(System.in);
	static void countvowels(String s) {
		int c=0;
		String sen=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=sen.charAt(i);
			if(ch =='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				c++;
			}
		}
		System.out.println("Counting of vowels present in sentence : "+c);
	}
	public static void main(String[] args) {
		System.out.println("Enter the sentence to check the counting of vowels");
		String sentence=sc.nextLine();
		countvowels(sentence);
	}

}
