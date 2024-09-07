
public class DecimalTobinary {
	static void convert(int num) {
		String st="";
		while(num>0) {
			int r=num%2;
			st=r+st;
			num/=2;
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
		int num=85;
		convert(num);
	}

}
