
public class UniqueArrayelemnt {
	static void Unique(int []arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1)
				System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,62,62,62,3,2,1,2};
		boolean rs[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=0;
			int ch=arr[i];
			if(rs[i]==false) {
				for(int j=0;j<arr.length;j++) {
					int b=arr[j];
						if(ch==b) {
							count++;
							rs[j]=true;
						}	
				}
				System.out.println(ch +" has been in the array "+ count +" times");
			}
		}
		Unique(arr);
	}

}
