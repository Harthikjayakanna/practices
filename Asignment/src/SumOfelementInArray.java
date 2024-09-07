import java.util.Arrays;

public class SumOfelementInArray {
	static void convert(int arr[]) {
		int puth[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int a=arr[i];
			puth[i]=single(a);
		}
		System.out.println(Arrays.toString(puth));
		String st=Arrays.toString(puth);
	}
	static int single(int a) {
		
		while(a>9) {
			int sum=0;
			while(a>0) {
				int last=a%10;
				sum+=last;
				a/=10;
			}
			a=sum;
		}
		
		return a;
	}
	public static void main(String[] args) {
		int arr[]= {23,345,231,345,99,98};
		convert(arr);
	}

}
