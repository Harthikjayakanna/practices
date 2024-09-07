package forloop;

public class factorial {
public static void main(String[] args) {
	int n=4;
	int factorial=1;
	for(int i=1;i<=n;i++) {
		factorial=factorial*i;  //1*2*3*4=24 this is factorial.
	}
	System.out.println(factorial);
}
}
