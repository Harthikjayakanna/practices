package Pattern;

public class half_diamond_left {
public static void main(String[] args) {
	int n=9; int star=1;
	for(int i=1;i<=n;i++) {
		for(int st=1;st<=star;st++) {
			System.out.print("*");
		}
		if(i<(n/2)+1) {
			star++;
		}
		else {
			star--;
		}
		System.out.println(" ");
	}
}
}
