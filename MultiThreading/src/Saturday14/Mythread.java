package Saturday14;

public class Mythread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i +"Printed by " + Thread.currentThread().getName());
		}
	}

}
