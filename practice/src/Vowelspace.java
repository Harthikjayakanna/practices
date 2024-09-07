import java.util.ArrayList;

public class Vowelspace{
	static void change(String str) {
		String word="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			word+=ch;
			if(ch==32 || i==str.length()-1) {
				check(word);
				word="";
			}
		}
	}
	static void check(String word) {
		int conse=0;
		int vowels=0;
		String temp="";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'
					||ch=='O'||ch=='U') {
				vowels++;
			}
			else {
				conse++;}
		}
	}
	public static void main(String[] args) {
		String str="Hellow what are you doing bing";
		change(str);
	}

}