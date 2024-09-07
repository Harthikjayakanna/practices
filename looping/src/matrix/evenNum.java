package matrix;

public class evenNum {
public static void main(String[] args) {
	int arr[][]=new int [2][2];
	arr[0][0]=3;arr[0][1]=4;
	arr[1][0]=6;arr[1][1]=5;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			if(arr[i][j]%2==0) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
}
