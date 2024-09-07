package DeadLock;

import Synchronizedblock.Mythread;

public class test {
	static String s1="hellow";
	static String s2="hii";
	public static void main(String[] args) {
		Runnable r=()->{
			synchronized (s1) {
				System.out.println("the thread is hold by "+s1);
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				synchronized (s2) {
				   System.out.println(Thread.currentThread().getName()+" the loack belongs to "+s2);	
				}
			}
		};
		Runnable r1=()->{
			synchronized (s2) {
				System.out.println("the thread is hold by "+s2);
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				synchronized (s1) {
				   System.out.println(Thread.currentThread().getName()+" the loack belongs to "+s1);	
				}
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r1);
		t1.start();t2.start();
	}

}
