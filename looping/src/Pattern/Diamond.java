package Pattern;

public class Diamond {
public static void main(String[] args) {
	int n=9; int star=1; int space=n/2;
	int s=0;
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=space;sp++) {
			System.out.print(" ");
		}
		for(int st=1;st<=star;st++) {
			System.out.print("*");
		}
		if(i<(n/2)+1) {
			star+=2;
			space--;
		}
		else {
			star-=2;
			space++;
		}
		System.out.println(" ");
	}
}
}
