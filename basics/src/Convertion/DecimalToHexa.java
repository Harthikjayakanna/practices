package Convertion;

public class DecimalToHexa {
	static void convert(int num) {
		String st="";
		while(num>0) {
			int r=num%16;
			if(r<10)
				st=r+st;
			else {
				r+=55;
				st=(char)r+st;
				}
			num/=16;
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
		int num=258965;
		convert(num);
	}

}
