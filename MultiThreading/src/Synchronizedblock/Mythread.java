package Synchronizedblock;

public class Mythread extends Thread{
	Table t;
	int n;
	@Override
	public void run() {
		t.print(n);
	}
	public Mythread(Table t,int n) {
		this.t=t;
		this.n=n;
	} //constructor

}
