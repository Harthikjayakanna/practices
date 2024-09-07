package array;

public class secondgreat {
public static void main(String[] args) {
	int arr[]= {34,2,34,65,78,45};
	int fg=0;
	int sg=0;
	for(int i=0;i<=arr.length-1;i++) {
		int n=arr[i];
		if(n>fg) {
			sg=fg;
			fg=n;
		}
		else if(n>sg) {
			sg=n;
		}
	}
	System.out.println(sg);
}
}
