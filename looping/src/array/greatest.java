package array;

public class greatest {
public static void main(String[] args) {
	int arr[]= {23,12,5,34,56,98};
	int great=0;
	for(int i=0;i<arr.length;i++) {
		int n=arr[i];
		if(n>great) {
			great=n;
		}
	}
	System.out.println(great);
}
}
