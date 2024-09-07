package Leetcode;

public class StringCALC {
	static void calci(String st) {
		int a=0;
		int b=0;
		char g='a';	String s="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
		
			if(ch>=48&&ch<=57) {
				s+=ch;
			}
			if(ch==43||ch==45||ch==42||ch==47) {
				g=ch;
				a=Integer.parseInt(s);
				s="";
			}
			if(i==st.length()-1) {
				b=Integer.parseInt(s);
			}
		}
		if(g==43)
			System.out.println(a+b);
		if(g==45)
			System.out.println(a-b);
		if(g==42)
			System.out.println(a*b);
		if(g==47)
			System.out.println(a/b);
	}
	public static void main(String[] args) {
		String st="54*90";
		calci(st);
	}

}
