package Chapter29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		//Create a fixed thread pool with maximum three threads
		//ExecutorService executor = Executors.newFixedThreadPool(3);
		ExecutorService executor = Executors.newCachedThreadPool();
		//Submit runnable tasks to the executor
		
		executor.execute(new PrintChar('a',10));
		executor.execute(new PrintChar('b',10));
		executor.execute(new PrintNum(10));
		
		//Shut down the executor
		executor.shutdown();
	}

}
