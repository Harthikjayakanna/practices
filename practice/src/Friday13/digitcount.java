package Friday13;

public class digitcount {
	static void count(int num) {
		int c=0;
		while(num>0) {
			c++;
			num/=10;
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		int num=234;
		count(num);
	}

}
