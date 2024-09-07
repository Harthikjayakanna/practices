package change;
import java.util.*;
public class alpabet {
public static void main(String[] args) {
	Scanner sr=new Scanner(System.in);
	System.out.println("enter the character");
	char ch=sr.next().charAt(0);
	if(ch>='a'&&ch<='z') {
		System.out.println((char)(ch-32));
	}
	else if(ch>='A'&&ch<='Z') {
		System.out.println((char)(ch+32));
	}
	else {
		System.out.println("invalid char");
	}
}
}
