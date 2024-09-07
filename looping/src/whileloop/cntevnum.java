package whileloop;

public class cntevnum //counting even number in the digit
{
public static void main(String[] args) {
	int n=234567;
	int count=0;
	int temp=n;
	while(n!=0) {
		int last=n%10; // to take the last digit
		if(last%2==0) //checking the last digit even or not
		{
			count++;
			System.out.println(last);
		}
		n=n/10;
	}
	System.out.println(temp+" has "+"count"+" even digit");
}
}
