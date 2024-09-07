package checking;

public class smallestno {
public static void main(String[] args) {
	int s=4;int s2=10;int s3=45;
	int s1=0;
	if(s>s1&&s>s2&&s>s3) {
		System.out.println(s+" is smallest");
	}
	else if(s1>s2&&s1>s3) {
		System.out.println(s1+"is smallest");
	}
	else if(s2>s3) {
		System.out.println(s2+"is smallest");
		
	}
	else {
		System.out.println(s3+"is smallest");
	}
	
}
}
