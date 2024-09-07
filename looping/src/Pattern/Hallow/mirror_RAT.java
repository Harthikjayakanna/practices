package Pattern.Hallow;

public class mirror_RAT {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=n;j>=1;j--) {
			if(i==j|j==n|i==1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
}
}
