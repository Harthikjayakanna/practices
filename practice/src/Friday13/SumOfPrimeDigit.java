package Friday13;

public class SumOfPrimeDigit {
	static boolean prime(int num) {
		int c=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2)
			return true;
		else
			return false;
	}
	static void sumofprime(int num) {
		int sum=0;
		while(num>0) {
			int last=num%10;
			if(prime(last)) {
				sum+=last;
			}
			num/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int num=22357;
		sumofprime(num);
	}

}
