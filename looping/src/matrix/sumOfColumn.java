package matrix;

public class sumOfColumn {
public static void main(String[] args) {
	int arr[][]= {{2,3,4,4},{3,2,45,5},{23,12,34,23}};
	for(int i=0;i<=arr[0].length-1;i++) {
		int sum=0;
		for(int j=0;j<=arr.length-1;j++) {
			sum+=arr[j][i];
		}
		System.out.println("sum of column "+(i+1)+ "is "+sum );
	}
	
	
	
}
}
