package printingEvenOdd_MultipleThreads;

public class TestMain {
	public static void main(String[] args) {
		EvenOddPrinting printing = new EvenOddPrinting();
		Thread t1 = new Thread(printing);
		Thread t2 = new Thread(printing);
		
		for (int i = 0; i < 5; i++) {
			t1.start();
			t2.start();
		}
	}
}
