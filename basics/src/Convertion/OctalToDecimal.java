package Convertion;

public class OctalToDecimal {
	static void convert(int num) {
		int dec=0;
		int power=1;
		while(num>0) {
			int last=num%10;
			dec=dec+last*power;
			power*=8;
			num/=10;
		}
		System.out.println(dec);
	}
	public static void main(String[] args) {
		int num=234;
		convert(num);
	}

}
