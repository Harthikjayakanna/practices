package array;

public class primenumber {
public static void main(String[] args) {
	int arr[]= {12,32,8,3,7,17,99};
	for(int i=0;i<=arr.length-1;i++) {
		int n=arr[i];
		int count=0;
		
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n);
		}
	}
}
}
