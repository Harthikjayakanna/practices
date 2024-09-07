package Saturday14;

public class Test {
	public static void main(String[] args) {
		System.out.println("Main starts");
		Mythread t1=new Mythread();
		t1.setName("Jerold");
		t1.setPriority(8);
		t1.start();
		
		Mythread t2=new Mythread();
		t2.setName("Ajish");
		t2.setPriority(6);
		t2.start();
		System.out.println("Main ends");
	}

}
