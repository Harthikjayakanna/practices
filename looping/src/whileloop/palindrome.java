package whileloop;

public class palindrome {
	public static void main(String[] args) {
		int n=626;
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			int last=n%10; //to get the last digit, it comes as a remainder from divide
			rev=(rev*10)+last;
			n=n/10; //reduce the last digit
		}
		System.out.println(rev);
		if (rev==temp) 
		{
			System.out.println(rev+" is the palindrome");
		}
		else {
			System.out.println(rev+" is not palindrome");
		}
	}
}
