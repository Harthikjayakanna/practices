package Pattern.Hallow;

public class diamond {
public static void main(String[] args) {
	int n=9; int star=1; int space=n/2;
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=space;sp++) {
			System.out.print(" ");
		}
		for(int st=1;st<=star;st++) {
			if(st==1|st==star) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		if(i<(n/2)+1) {
			space--;
			star+=2;
		}
		else {
			space++;
			star-=2;
		}
		System.out.println(" ");
	}
}
}
