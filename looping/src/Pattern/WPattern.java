package Pattern;

public class WPattern {
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||j==i&&i>=n/2+1||(j+i==n+1)&&i>=n/2+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
