package SubString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringRep {
	static void Check(String num,String num2) {
        int count=0;
		for(int i=0;i<=num.length()-num2.length();i++) {
			String temp="";
			for(int j=i;j<i+num2.length();j++) {
				char che=num.charAt(j);
				temp+=che;
			}
			if(temp.equals(num2))
				count++;
		}
		System.out.println(count +" times");
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the MainString");
		String num=sc.nextLine();
		System.out.println("Enter the Sub String");
		String num1=sc.nextLine();
		System.out.println(num.indexOf(num1));
		Check(num,num1);
		
		//Regular Expression to check the substring
		Pattern p=Pattern.compile(num1);
		Matcher m=p.matcher(num);
		int count=0;
		 while(m.find())
			 count++;
		 System.out.println(count);
		 String s="";
		 String h=" ";
		 s=h;
		 char ch=s.charAt(0);
		 System.out.println(s.indexOf(ch));
		 System.out.println(s.length());
	}

}
