package test;

public class Complex {
	int a,b;
	public Complex(int a, int b){
		this.a=a;
		this.b=b;
	}
	public Complex add(Complex y) {
		int a=this.a+y.a;
		int b=this.b+y.b;
		return new Complex(a, b);
	}
	public Complex mul(Complex y) {
		int a=this.a*y.a;
		int b=this.b*y.b;
		return new Complex(a,b);
	}

}
