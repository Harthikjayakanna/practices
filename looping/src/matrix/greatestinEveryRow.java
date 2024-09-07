package matrix;

public class greatestinEveryRow {
public static void main(String[] args) {
	int arr[][]= {{12,23,34,45},{34,54,76,45},{32,45,32,98}};
	for(int i=0;i<=arr.length-1;i++) {
		int greatest=0;
		for(int j=0;j<=arr[i].length-1;j++) {
			if(arr[i][j]>greatest) {
				greatest=arr[i][j];
			}
			
		}
		System.out.println("the greatest no in row "+(i+1)+" is "+greatest);
	}
}
}
