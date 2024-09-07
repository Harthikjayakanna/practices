package whileloop;

public class factors {
public static void main(String[] args) {
	int i=1;
	int n=45;
	int count=0;
	while(i<n) {
		if(n%i==0) //it gives the factors of the given number. factors means divisible number
		{
			System.out.println(i);
		}
		i++;
	}
}
}
