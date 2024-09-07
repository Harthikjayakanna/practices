package whileloop;

public class countevnnum {
public static void main(String[] args) {
	int i=1;
	int n=50;
	int count=0;
	while(i<=n) {
		if(i%2==0) {
			count++;
		}
		i++;
	}
	System.out.println("even numbers between 1 -"+n+" is "+count);
}
}
