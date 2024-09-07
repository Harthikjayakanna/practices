package complexity;

public class Maxrep {
public static void main(String[] args) {
	String str="banana";
	String taken="";
	int count []=new int [str.length()];
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(taken.indexOf(ch)==-1) {
			int countchar=0;
			for(int j=0;j<str.length();j++) {
			char k=str.charAt(j);
			if(ch==k) {
				countchar++;
			          }                     }
			taken+=ch;
			count[i]=countchar;
	}
		else {
			count[i]=-1;
			}
	}
	System.out.println(taken);
	  for(int j=0;j<count.length;j++) {
		  System.out.println(count[j]);
	  }
	int max=maxcount(count);  //[1,3,2,-1,-1,-1]
	System.out.println(max);
	for(int i=0;i<=str.length()-1;i++) {
		if(count[i]==max) {
			System.out.println(str.charAt(i)+ " "+max);
		}
	}
}
  public static int maxcount(int arr[]) {
	  int maxe=0;
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]>maxe) {
			  maxe=arr[i];
		  }
	  }
	  return maxe;
  }
}
