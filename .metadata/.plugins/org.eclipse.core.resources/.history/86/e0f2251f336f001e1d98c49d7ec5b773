package ObjectlevelLock;


public class Test {
	public static void main(String[] args) {
		PrintThread pt=new PrintThread();
		pt.setName("Jerold");
		pt.start();
	}

}
class PrintThread extends Thread{
	@Override
	public void run() {
		Print p=new Print();
		p.print();
		
	}
}
 class Print{
	public synchronized void print() {
		if(Thread.holdsLock(this))
			System.out.println(Thread.currentThread().getName()+" holding the object level object of "+ this);
		else
			System.out.println("Thread not aquired");
	}
}

