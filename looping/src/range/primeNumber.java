package range;

public class primeNumber {
public static void main(String[] args) {
	int n1=1;
	int n2=100;
	for(int i=n1;i<=n2;i++){
		int c=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) 
				c++; }
		if(c==2) 
		{
			System.out.print(i+" ");
		}
	}
}
}
