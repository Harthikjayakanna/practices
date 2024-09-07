package Friday13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoneyConvertot {
	static void convert(String st1,String st2, HashMap<String, Double> valuee) {
		String s3=st1+"-"+st2;
		double d=valuee.get(s3);
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the currency type");
		String currency1=sc.next();
		System.out.println("Enter the Convert currency type");
		String currency2=sc.next();
		HashMap<String, Double> valuee=new HashMap<String, Double>();
		valuee.put("rupees-dollar", 85.0);
		convert(currency1,currency2,valuee);
		
	}

}
