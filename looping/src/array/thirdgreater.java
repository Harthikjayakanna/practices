package array;

public class thirdgreater {
public static void main(String[] args) {
	int arr[]= {23,54,6,76,13};
	int temp=0;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
	System.out.println(arr[2]);
}
}
