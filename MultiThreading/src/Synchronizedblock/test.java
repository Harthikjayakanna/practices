package Synchronizedblock;

public class test {
	public static void main(String[] args) {
		Table t=new Table();
		Mythread thread1=new Mythread(t,34);
		Mythread thread2=new Mythread(t,23);
		thread1.start();
		thread2.start();
	}

}
