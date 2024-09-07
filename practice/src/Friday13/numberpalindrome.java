package Friday13;

public class numberpalindrome {
	static void palindrome(int num) {
		int temp=num;
		int rev=0;
		while(num>0) {
			int last=num%10;
			rev=(rev*10)+last;
			num/=10;
		}
		if(rev==temp)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}
	public static void main(String[] args) {
		int num=343;
		palindrome(num);
	}

}
