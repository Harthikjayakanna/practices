package Pattern.Hallow;

public class Pyramid {
public static void main(String[] args) {
	int n=5; int star=1;
	int spacee=n-1;
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=spacee;sp++) {
			System.out.print(" ");
		}
		for(int st=1;st<=star;st++) {
			if(st==1||st==star||i==n) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		spacee--;
		star+=2;
		System.out.println();
	}
}
}
