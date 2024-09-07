package test;

public class Complextest {
public static void main(String[] args) {
	Complex x=new Complex(3,9);
	Complex y=new Complex(4,5);
	x=x.add(y);
	x=x.mul(y);
	System.out.println(x.a+" "+x.b);
}
}
