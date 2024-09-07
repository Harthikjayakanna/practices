package Leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MiddleOfArray {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        TreeSet<Integer> ts=new TreeSet<Integer>();
	        for(int a : nums1){
	            ts.add(a);
	        }
	        for(int a:nums2){
	            ts.add(a);
	        }
	        Object arr[]=ts.toArray();
	        System.out.println(ts);
	        double median=0.00000;
	        int mid=arr.length/2;
	        if(arr.length%2==0){
	            int mid2=mid-1;
	            double a=(double)((int)(arr[mid]));
	            double b=(double)((int)(arr[mid2]));
	            median=(a+b)/2;
	        }
	        else{
	            median=(double)((int)(arr[mid]));
	        }
	        return median;

	    }
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		int num2[]= {1,5,6,67,8};
		double n=findMedianSortedArrays(num, num2);
		System.out.println(n);
		
	}

}
