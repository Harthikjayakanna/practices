package matrix;

public class multiMatrix {
public static void main(String[] args) {
	int m1[][]= {{1,3,2},{2,5,1},{4,7,3}};
	int m2[][]= {{6,3,1},{3,2,1},{3,1,6}};
	int rev[][]=new int[m1.length][m1[0].length];
	for(int i=0;i<m1.length;i++) {
		for(int j=0;j<m1[0].length;j++) {
			for(int k=0;k<m2.length;k++) {
				rev[i][j]+=m1[i][k]*m2[k][j];
			}
			}
		}
 for(int i=0;i<=m1.length-1;i++) {
		for(int j=0;j<=m2[0].length-1;j++) {
			System.out.print(m1[i][j]+" ");

		}
		System.out.println( );
	}
	System.out.println("");
	for(int i=0;i<=m1.length-1;i++) {
		for(int j=0;j<=m2[0].length-1;j++) {
			System.out.print((m2[i][j]+" "));
			}
		System.out.println( );
	}
 for(int i=0;i<=m1.length-1;i++) {
		for(int j=0;j<=m2[0].length-1;j++) {
			System.out.print((rev[i][j]+" "));
      }
		System.out.println( );
	}	}
}
