package Friday13;

public class PrimeNumber {
	static void prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is a prime number");
		}
		else
			System.out.println("It is not a prime number");
	}
	public static void main(String[] args) {
		int num=11;
		prime(num);
	}

}
