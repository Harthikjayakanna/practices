package forloop;

public class primenum {
public static void main(String[] args) {
	int n=17;
	int c=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0)
	{
			c++;
			}
	} // here for loop ends
		if(c==2)
		{
			System.out.println(n +" is the pm");
		}
		else
		{
			System.out.println((n+" is not a pm"));
		}
		
	}
}

