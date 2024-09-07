package test;

import java.util.ArrayList;

public class mergeName {
	public static void main(String[] args) {
		String arr1[]= {"Jerold","jayanth","Hero","Asadi"};
		String arr2[]= {"Abishek","Jayanth","jerold","Mani","Sathya"};
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<arr1.length;i++) {
			al.add(arr1[i].toLowerCase());
		}
		for(int i=0;i<arr2.length;i++) {
			if(al.contains(arr2[i].toLowerCase())==false) {
				al.add(arr2[i].toLowerCase());
			}
		}
		for(String name : al) {
			System.out.println(name);
		}
	}

}
