package Pattern;

public class pyramid {
public static void main(String[] args) {
	int n=5; int star=1;int spacce=n-1;
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=spacce;sp++) {
			System.out.print(" ");
		}
		for(int st=1;st<=star;st++) {
			System.out.print("*");
		}
		
			star+=2;
			spacce--;
		
		System.out.println(" ");
	}
}
}
