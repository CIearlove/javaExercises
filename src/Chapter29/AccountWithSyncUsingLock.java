package Chapter29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 利用加锁同步，解决AccountWithoutSync中出现的冲突。
 * @author Administrator
 *
 */
public class AccountWithSyncUsingLock {

	//同一个账户
	private static Account account = new Account();
	
	public static void main(String[] args) {
		
	    ExecutorService executor = Executors.newCachedThreadPool();

	    // Create and launch 100 threads
	    for (int i = 0; i < 100; i++) {
	      executor.execute(new AddAPennyTask());
	    }

	    executor.shutdown();

	    // Wait until all tasks are finished
	    while (!executor.isTerminated()) {
	    }

	    System.out.println("What is balance? " + account.getBalance());
	  }
	
	// A thread for adding a penny to the account
	  private static class AddAPennyTask implements Runnable {
	    public void run() {
	      account.deposit(1);
	    }
	  }
	  
	// An inner class for account
	  private static class Account {
	    private int balance = 0;
	    private Lock lock = new ReentrantLock();//Create a lock
	    
	    public int getBalance() {
	      return balance;
	    }

	    public void deposit(int amount) {
	    	lock.lock();//Acquire the lock
	    	try{
	    		int newBalance = balance + amount;

	  	        // This delay is deliberately added to magnify the
	  	        // data-corruption problem and make it easy to see.
	  	      
	  	        Thread.sleep(5);
	  	        balance = newBalance;
	    	}
	    	catch (InterruptedException ex) {
		    }
	        finally{
	        	lock.unlock();//Release the lock
	        }
	    }
	  }
}
