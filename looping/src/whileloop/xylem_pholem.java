package whileloop;
//xylem means sum of first and last digit equals sum of middles.
//pholem means its a not a pholem 
public class xylem_pholem {
public static void main(String[] args) {
	int n=4326;
	int temp=n;
	int last=n%10; //to get a last number.
	n=n/10; // here making the last number out of looping
	int middle=0;
	int sum=0;
	while(n!=0) {
		int t=n%10; //2,3,4
		if(t==n) //here enters only when t=4,n=4
		{
			int first=t; //2
			sum=last+first;
		}
		else {
			 middle=middle+t; //0+2,2+3, 6
		}
		
		n=n/10; // to reduce the digits. 43,4	
		}
	if (sum==middle) {
		System.out.println(temp+" is the xylem");
	}
	else
	{
		System.out.println(temp+" is pholem");
	}
}
}
