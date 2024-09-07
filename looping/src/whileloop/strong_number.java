package whileloop;
//strong number means sum of factorials = the actual number
public class strong_number {
	static int factorial(int a) {
		int fact=1;
		for(int i=0;i<=a;i++) {
				fact=fact*a;
			}
		return fact;
	}
public static void main(String[] args) {
	int n=146;
	int sum=0;
	int temp=n;
	while(n!=0) {
		int last=n%10; //4,3,2, to get a last digit
		sum=sum+ factorial(last);
		
		n=n/10; //update condition to reduce the digit 14,1
	}
	if(sum==temp) {
		System.out.println(temp+" is the strong number");
	}
	else
	{
		System.out.println(temp+" is not a strong number");
	}
}}
