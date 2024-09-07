import java.util.Scanner;

public class gs {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%3==0&& n%5==0 ) {
		System.out.println("fuzzz buzzzz");
	}
	else if(n%3==0) {
		System.out.println("fuzz");
	}
	else if(n%5==0) {
		System.out.println("buzzz");
	}
	 
	 else {
		 System.out.println("durrrrr");
	 }
}
}
