package fixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolCreation {
	public static void main(String[] args) {
	ExecutorService service = Executors.newFixedThreadPool(5);
	for (int i = 0; i < 10; i++) {
		service.execute(new FixedThreadPoolLearning(i));
		
	}
	
	service.shutdown();  
    while (!service.isTerminated()) {  
    	
    }  

    System.out.println("Finished all threads");  

}
}
