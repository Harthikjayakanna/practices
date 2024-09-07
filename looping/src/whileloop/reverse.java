package whileloop;
//wirte a java program to reverse the digit in gn number?
public class reverse 
{
public static void main(String[] args) {
	int n=3425627;
	int rev=0;
	while(n!=0)
	{
		int last=n%10; //to get the last digit, it comes as a remainder from divide
		rev=(rev*10)+last;
		n=n/10; //reduce the last digit
	}
	System.out.println(rev);
}
}
