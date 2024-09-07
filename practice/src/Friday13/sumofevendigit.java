package Friday13;

public class sumofevendigit {
	static void sumofeven(int num) {
		int sum=0;
		while(num>0) {
			int last=num%10;
			if(last%2==0) {
				sum+=last;
			}
			num/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int num=234;
		sumofeven(num);
	}

}
