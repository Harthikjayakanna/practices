package wednesday4;

public class TransposeMatrix {

	public static void main(String[] args) {
		int arr[][]= {{1,4,5},{5,6,9},{9,4,2}};
		int newarr[][]=new int[3][3];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				newarr[i][j]=arr[j][i];
			}
		}
		System.out.println("Given Matrix");
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("transpose matrix");
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(newarr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
