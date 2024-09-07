package Pattern;

public class updown_pyramid {
public static void main(String[] args) {
	int n=5; int star=(n*2)-1;int space=0;
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=space;sp++) {
			System.out.print(" ");
		}
		for(int st=1;st<=star;st++) {
			System.out.print("*");
		}
		star-=2;
		space++;
		System.out.println("");
	}
}
}
