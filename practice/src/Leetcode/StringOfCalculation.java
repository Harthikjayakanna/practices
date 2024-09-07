package Leetcode;

import java.util.ArrayList;

public class StringOfCalculation {
	static void calculate(String st) {
		ArrayList<Object> al=new ArrayList<Object>();
		double num=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>=48&&ch<=57) {
				double n=Character.getNumericValue(ch);
				num=num*10+n;
			}
			if(ch==43||ch==45||ch==42||ch==47) {
				if(num!=0) {
				   al.add(num);
				   }
				al.add(ch);
				num=0;
			}
			if(i==0) {
				if(!(ch>=48&&ch<=57)) {
					System.out.println("Invalid input");
				return;
				}
			}
			if(i==st.length()-1) {
				if(ch>=48&&ch<=57) {
					al.add(num);
					calcu(al);
					}
				else {
					System.out.println("Invalid Input");
				return;
				}
			}
		}
	}
	static void calcu(ArrayList al) {
		System.out.println(al);
		String cc="+-*/";
		while(al.size()>1) {
			double a,b;
			if(al.contains('/')) {
				int index=al.indexOf('/');
				if(cc.contains(String.valueOf(al.get(index-1)))|| cc.contains(String.valueOf(al.get(index+1))))
				{
					System.out.println("Invalid input");
					return;
				}
				a=(double)(al.get(index-1));
				b=(double)(al.get(index+1));
				al.remove(index-1);
				al.remove(index-1);
				al.remove(index-1);
				al.add(index-1, a/b);
				System.out.println(al);
			}
			if(al.contains('*')) {
				int index=al.indexOf('*');
				if(cc.contains(String.valueOf(al.get(index-1)))|| cc.contains(String.valueOf(al.get(index+1))))
				{
					System.out.println("Invalid input");
					return;
				}
				a=(double)(al.get(index-1));
				b=(double)(al.get(index+1));
				al.remove(index-1);
				al.remove(index-1);
				al.remove(index-1);
				al.add(index-1, a*b);
				System.out.println(al);
				
			}
			if(al.contains('+')) {
				int index=al.indexOf('+');
				if(cc.contains(String.valueOf(al.get(index-1)))|| cc.contains(String.valueOf(al.get(index+1))))
				{
					System.out.println("Invalid input");
					return;
				}
				a=(double)(al.get(index-1));
				b=(double)(al.get(index+1));
				al.remove(index-1);
				al.remove(index-1);
				al.remove(index-1);
				al.add(index-1, a+b);
				System.out.println(al);
			}
			if(al.contains('-')) {
				int index=al.indexOf('-');
				if(cc.contains(String.valueOf(al.get(index-1)))|| cc.contains(String.valueOf(al.get(index+1))))
				{
					System.out.println("Invalid input");
					return;
				}
				a=(double)(al.get(index-1));
				b=(double)(al.get(index+1));
				al.remove(index-1);
				al.remove(index-1);
				al.remove(index-1);
				al.add(index-1, a-b);
				System.out.println(al);
			}
		}
		double a=(double)(al.get(0));
		System.out.println(Math.floor(a*100)/100.0);
//		System.out.println("OTP :"+(int)(Math.floor(Math.random()*8999)+1000));
	}
	public static void main(String[] args) {
		String st="5+5*3";
		calculate(st);
	}
}
