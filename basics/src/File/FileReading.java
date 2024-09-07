package File;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.TreeSet;

public class FileReading {
	static String get(String str) {
		String file="";
		try {
			file=new String(Files.readAllBytes(Paths.get(str)));
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return file;
	}
	static void count(String words) {
		String temp="";
		for(int i=0;i<words.length();i++) {
			char ch=words.charAt(i);
			int count=0;
			if(temp.indexOf(ch)==-1 && ch>=65 && ch<=90) {
				for(int j=0;j<words.length();j++) {
					char k=words.charAt(j);
					if(ch==k) {
						count++;
					}
				}
				HashMap<Character, Integer> value=new HashMap<Character, Integer>();
				value.put(ch, count);
				System.out.println(ch + " : "+ count);
				temp+=ch;			
			}
		}
	}
	public static void main(String[] args) {
		String str="D:\\Programs\\Identifyuniquecharacter.txt";
		String words=get(str);
		count(words.toUpperCase());
	}

}
