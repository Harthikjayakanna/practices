package array;

public class even {
public static void main(String[] args) {
	int arr[]= {23,34,54,56};
	for(int i=0;i<=arr.length-1;i++) {
		int n=arr[i];
		if(n%2==0) {
			System.out.println(n);
		}
	}
}
}
