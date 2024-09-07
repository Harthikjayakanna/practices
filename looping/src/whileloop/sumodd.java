package whileloop;

public class sumodd //sum of the odd number in the digit
{
public static void main(String[] args) {
	int n=123456789;
	int temp=n;
	int sum=0;
	while(n!=0) {
		int last=n%10;
		if(last%2!=0) {
			sum=sum+last;
		}
		n=n/10; // update to reduce the last digit
	}
	System.out.println("sum of odd in "+temp+" is "+sum);
}
}
