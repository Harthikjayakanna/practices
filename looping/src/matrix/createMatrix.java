package matrix;

public class createMatrix {
public static void main(String[] args) {
	int [][]arr= new int [4][2];
	arr[0][0]=9;arr[0][1]=3;
	arr[1][0]=89;arr[1][1]=30;
	arr[2][0]=87;arr[2][1]=23;
	arr[3][0]=32;arr[3][1]=43;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
