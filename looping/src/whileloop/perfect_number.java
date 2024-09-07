package whileloop;
//perfect number means sum of the factors = given number
public class perfect_number {
public static void main(String[] args) {
	int n=6;
	int i=1;
	int sum=0;
	while(i<n) {
		if(n%i==0) {
			sum=sum+i;
			System.out.println(i);
		}
		i++;
	}
	if (sum==n)
	{
		System.out.println(n+" is perfect number");
	}
	else
	{
		System.out.println(n+" is not perfect number");
	}
}
}
