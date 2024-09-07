package forloop;

public class Armstrong {
	public static int count(int n) 
	{
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
		
	}
	public static int power(int n,int m) 
	{
		int power=1;
				for(int i=1;i<=m;i++) {
					power=power*n;
				}
		return power;
	}
public static void main(String[] args) 
{
	int n=100000;
	for(int i=1;i<=n;i++) {
	int j=i;
	int temp=j;
	int digit= count(j);
	int sum=0;
	while(j!=0)
	{
		int last=j%10;
		sum=sum+power(last,digit);
		j=j/10;
		
	}
	if(temp==sum) {
		System.out.println(temp +" is Armstrong number");
	}
	}
}
}
