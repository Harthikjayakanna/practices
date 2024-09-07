package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class highfrequencySort {
	static void sort(int [] arr) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i : arr)
			al.add(i);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		while(al.size()>0) {
			int high=0;
			int max=0;
			for(int num : al) {
				int count=0;
				for(int num1 : al) {
					if(num==num1)
						count++;
				}
				if(count>high) {
					high=count;
					max=num;
				}
			}
			for(int p=0;p<high;p++) {
				al.remove((Object)(max));
				al2.add(max);
			}
		}
		int ar[]=new int[al2.size()];
		for(int n=0;n<al2.size();n++) {
			ar[n]=(int)(al2.get(n));
		}
		System.out.println(Arrays.toString(ar));
	}
	public static void main(String[] args) {
		int arr[]= {12,56,56,56,23,23,24,24,24,24,12,12,34,56};
		sort(arr);
	}
}
