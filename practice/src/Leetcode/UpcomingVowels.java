package Leetcode;

import java.util.Scanner;

public class UpcomingVowels {
	static void nextvow(String ch) {
		for(int i=(int)(ch.charAt(0))+1;i<=123;i++) {
			char che=(char)(i);
			if(che=='a'||che=='e'||che=='i'||che=='o'||che=='u'||
					che=='A'||che=='E'||che=='I'||che=='O'||che=='U') {
				System.out.println(che);
				return;
			}
			if(i==123) 
				i=64;
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String ch=sc.next();
		nextvow(ch);
	}

}
