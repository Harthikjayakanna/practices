package Pattern;

public class half_diamond_right {
public static void main(String[] args) {
	int n=9; int star=1; int space=n/2;
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=space;sp++) {
			System.out.print(" ");
		}
		for(int st=1;st<=star;st++) {
			System.out.print("*");
		}
		if(i<(n/2)+1) {
			star++;
			space--;
		}
		else {
			star--;
			space++;
		}
		System.out.println(" ");
	}
}
}
