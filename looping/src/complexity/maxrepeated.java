package complexity;

public class maxrepeated {
public static void main(String[] args) {
	String str="hamana khan";
	int count[]=new int [str.length()];
	String taken="";
	for(int i=0;i<=str.length()-1;i++) {
		char ch =str.charAt(i);
		if(taken.indexOf(ch)== -1) {
			int numbers=0;
			for(int j=0;j<=str.length()-1;j++) {
				char k=str.charAt(j);
				if(ch==k) {
					numbers++;
				}
			}
			count[i]=numbers;
			taken+=ch;
		}
		else
			count[i]= -1;
	}
	int high=maxcount(count);
	for(int i=0;i<=count.length-1;i++) {
		if(count[i]==high) {
			System.out.println(str.charAt(i)+ " "+high);
		}
	}
}





   static int maxcount(int arr[]) {
	   int max=0;
	   for(int i=0;i<=arr.length-1;i++) {
		   if(arr[i]>max) {
			   max=arr[i];
		   }
	   }
	   return max;
   }
}
