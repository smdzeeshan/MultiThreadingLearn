package threadCreatiion;

public class ExtendsThreadWay extends Thread {

//	public ExtendsThreadWay(String name) {
//		super(name);
//	}
//	
//	public ExtendsThreadWay() {
//		
//	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is created ");
	}
	
	public static void main(String[] args) {
		ExtendsThreadWay t1 = new ExtendsThreadWay();
		t1.run();
	}
}
