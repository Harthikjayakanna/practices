package matrix;

public class greatestNumColumn {
public static void main(String[] args) {
	int arr[][]= {{23,32,12},{21,45,24},{43,21,13}};
	for(int i=0;i<=arr[0].length-1;i++) {
		int great=0;
		for(int j=0;j<=arr.length-1;j++) {
			if(arr[j][i]>great) {
				great=arr[j][i];
			}
		}
		System.out.println("the greatest number in column "+(i+1)+" is "+great);
	}
}
}
