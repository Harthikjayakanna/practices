
public class CircularPrimeNumber {
	static int countdigit(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	static void checkprime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		
		if(count==2)
			System.out.println(num +" is a primeNumber");
		else
			System.out.println(num +" is not a prime number");
	}
	static void circularprime(int num) {
		int digitcount=countdigit(num);
		int change=0;
		int temp=num;
        if(digitcount>1) {
			change=1;
			for(int i=1;i<digitcount;i++) {
	              change*=10;
			}
		}
		for(int i=0;i<digitcount;i++) {
			checkprime(num);
			int last=num%10;
			int remain=num/10;
			num=(last*change)+remain;	
		}
		
	}
	
	public static void main(String[] args) {
		int num=184;
		circularprime(num);
	}

}
