package Thursday5;

import java.util.Scanner;

public class VowelstoSplCharacter {
	static Scanner sc = new Scanner(System.in);
	static void change(String sent,String ch) {
		String newsen="";
		String sen=sent.toLowerCase();
		for(int i=0;i<sen.length();i++) {
			char che=sen.charAt(i);
			if(che =='a' || che=='e'||che=='i'||che=='o'||che=='u') {
				 newsen+=ch;
			}
			else
				newsen+=che;
		}
		System.out.println(newsen);
	}
	public static void main(String[] args) {
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		System.out.println("Enter the special character");
		String ch=sc.next();
		change(sentence,ch);
	}

}
