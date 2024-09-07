package interview;

import java.util.ArrayList;
import java.util.List;

public class palindrome {
	static int ispalindrome(int num) {
		int range=1000;
		for(int i=1;i<=range;i++) {
			int temp=num;
			int rev=0;
			while(temp!=0) {
				int g=temp%10;
				rev=(rev*10)+g;
				temp=temp/10;
			}
			if(num==rev) {
				return 1;
			}
			else {
				return 0;
			}
		}
		return 0;
	}
public static void main(String[] args) {
	 int num=232;
	 num+=1;
     while(ispalindrome(num)==0) {
    	 num=num+1;
     }
     System.out.println(num);
}
	}


