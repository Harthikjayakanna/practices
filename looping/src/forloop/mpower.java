package forloop;

public class mpower {
	public static void main(String[] args) {
		
   int mpower=1;
   int n=15;
   int m=2; //this is the power so its looping times we have to give
   for (int i=1;i<=m;i++)
   {
	mpower*=n;  //calculation for power starts from 1*15*15 two looping.
}
   System.out.println(mpower);
}
}