package printingEvenOdd_MultipleThreads;

public class EvenOddPrinting implements Runnable{
	private static int i = 1;
	

	public static synchronized void print() {
		
		System.out.println("printed by " +Thread.currentThread().getName() + " "+ i++);
	}

	@Override
	public void run() {
		print();
	}
	
	
}