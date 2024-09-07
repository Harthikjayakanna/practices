package whileloop;

public class countdigit {
public static void main(String[] args) {
	int n=23456;
	int temp=n;
	int count=0;
	while(temp>0)
	{
		count++;
		temp=temp/10;
	}
	System.out.println(n+" has "+count+" digit");
	
}
}
