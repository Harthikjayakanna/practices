package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueNames {
	static void makeuni(String [] names) {
		ArrayList<String> nms=new ArrayList<String>();
		for(String name : names) {
			if(nms.contains(name)){
	            int k=1;
				while(nms.contains(name)){
					if(k>1) {
					String temp="";	
					for(int i=0;i<name.length()-3;i++) {
						char ch=name.charAt(i);
						temp+=ch;
					}
					name=temp;
				}
					name+="("+k+++")";
	            }
	            nms.add(name);	
			}
	        else
				 nms.add(name);
			}
		System.out.println(nms);
		String ss[]=new String[nms.size()];
		int id=0;
		for(String name: nms) {
			
			ss[id++]=name;
		}
		System.out.println(Arrays.toString(ss));
	}
	public static void main(String[] args) {
		String names[]= {"onepiece(1)","onepiece(1)","onepiece","onepiece","naruto","naruto"};
	    makeuni(names);
	}

}
