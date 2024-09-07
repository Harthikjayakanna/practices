package matrix;

public class addarray {
public static void main(String[] args) {
	int arr1[][]= {{1,23,21},{6,4,5},{54,67,23}};
	int arr2[][]= {{23,43,56},{56,76,12},{45,32,15}};
	int arr3[][]= new int [arr1.length][arr1[0].length];
	if(arr1.length==arr2.length &&arr1[0].length==arr2[0].length) {
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				arr3[i][j]= arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[0].length-1;j++) {
				System.out.print((arr3[i][j]+" "));

			}
			System.out.println( );
		}
	}
	
	
}
}
