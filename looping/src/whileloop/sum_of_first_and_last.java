package whileloop;
//write a java program to sum first and last digit in the number
public class sum_of_first_and_last {
public static void main(String[] args) {
	int n=56478;
	int last=n%10; //8 here
	int sum=0;
	while(n!=0) {
		int first=n%10; //8,7,4,6,5
		if(first==n) 
		{
			sum=last+first;
		}
		n=n/10; //5647,564,56,5,0
	}
	System.out.println(sum);
}
}
