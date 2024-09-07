package Convertion;

public class DecimalToOctal {
	static void convertion(int num) {
		String st="";
		while(num>0) {
			int r=num%8;
			st=r+st;
			num/=8;
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
		int num=156;
		convertion(num);
	}

}
