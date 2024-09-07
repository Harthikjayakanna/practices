package whileloop;
//write a java program to print a sum of digit in the gn number
public class sumofdigit {
public static void main(String[] args) {
	int n=545638;
	int sum=0;
	while(n!=0) {
		int last=n%10; //to get the last number.
		sum=sum+last;
		n=n/10; //to reduce the digits
		
	}
	System.out.println(sum);
}
}
