package Friday13;

public class sumofdigit {
	static void add(int num) {
		int sum=0;
		while(num>0) {
			int last =num%10;
			sum+=last;
			num/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int num=3456;
		add(num);
	}

}
