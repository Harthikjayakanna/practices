package array;

public class reversethearray {
  public static void main(String[] args) {
	int arr[]= {12,32,45,2,45,65};
	int rev[]=new int[arr.length];
	int index=0;
	for(int i=arr.length-1;i>=0;i--) {
		int n=arr[i];
		rev[index]=n;
		index++;
	}
	for(int j=0;j<=rev.length-1;j++) {
		System.out.print(rev[j]+" ");
	}
}
}
