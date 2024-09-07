package dowhileloop;

public class countfactor {
public static void main(String[] args) {
	int i=1;
	int n=60;
	int count=0;
	do {
		if(n%i==0) {
			count++;
			System.out.println(i);
		}i++;
	}
	while(i<n);
	System.out.println("counts of factors = "+count);

}
}
