package SubString;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxAddition {
	static void FindMax(ArrayList<Integer> arr,int range) {
		int high=0;
		String highSubString="";
		String arrat="";
		for(int i=0;i<=arr.size()-range;i++) {
			int sum=0;
			String temp="";
			for(int j=i;j<i+range;j++) {
				sum+=arr.get(j);
				temp+=arr.get(j)+" ";	
			}
			if(sum>high) {
				high=sum;
				highSubString=temp;
			}		
		}
		//storing array in a String to print 
		for(int a : arr) {
			arrat+=a+" ";
		}	
		//output content
		System.out.println("In the Array of "+"["+arrat+"]"+" ,"+"( "+highSubString+
				")"+" is the higher combination with total of "+high);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for array length 6");
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<6;i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("Enter Subnumber range");
		int range=sc.nextInt();
		FindMax(arr,range);
	}

}
