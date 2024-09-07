package Friday13;

public class reverseNumber {
	static void reverse(int num) {
		int temp=num;
		int rev=0;
		while(num>0) {
			int last =num%10;
			rev=(rev*10)+last;
			num/=10;
			
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		int num=2345;
		reverse(num);
	}

}
