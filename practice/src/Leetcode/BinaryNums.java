package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class BinaryNums {
	static void createArraybinary(String nums[],int n) {
		ArrayList<String> al=new ArrayList<String>();
		int power = power(n);
		while(al.size()<power) {
			String st="";
			int count=0;
			for(int i=0;i<nums[0].length();i++) {
				Random r=new Random();
				int x=r.nextInt(2);
				st+=x;
			}	
			if(al.contains(st)==false) {
			  for(String s:nums) {
				if(st.equals(s))
					count++;
			    }
			
			}
			if(count==0) {
				System.out.println(st);
				return;
			}
		}
		System.out.println("all are present");
	}
	static int power(int n) {
		int power=1;
		for(int i=0;i<n;i++) {
			power*=2;
		}
		return power;
	}
	public static void main(String[] args) {
		String nums[]= {"11","10"};
		int n=nums[0].length() ;
		createArraybinary(nums,n);
		
		//000,001,010,100,011,101,110,111
	}

}
