package ClasslevelLock;

public class Text{
	public static void main(String[] args) {
		PrintThread pt=new PrintThread();
		pt.setName("Jerold");
		pt.start();
	}

}
class PrintThread extends Thread{
	@Override
	public void run() {
		Print.print();
	}
}
 class Print{
	public static synchronized void print() {
		if(Thread.holdsLock(Print.class))
			System.out.println(Thread.currentThread().getName()+" holding the class level object of "+ Print.class);
		else
			System.out.println("Thread not aquired");
	}
}
