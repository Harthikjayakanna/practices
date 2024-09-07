package Convertion;

public class BinaryToDecimal {
	static void convert(int num) {
		int dec=0;
		int power=1;
		while(num>0) {
			int last=num%10;
			dec=dec+last*power;
			power*=2;
			num/=10;
		}
		System.out.println(dec);
	}
	public static void main(String[] args) {
		int num=1010101;
		convert(num);
	}

}
