package Chapter29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCooperation {
	//同一个账户
		private static Account account = new Account();
		
		public static void main(String[] args) {
			
			System.out.println("Thread 1\t\tThread 2\t\tBalance");
			
		    ExecutorService executor = Executors.newFixedThreadPool(2);
		    executor.execute(new DepositTask());
		    executor.execute(new WithdrawTask());
		    executor.shutdown();

		    
		  }
		
		// A thread for adding an amount to the account
		  private static class DepositTask implements Runnable {
		    public void run() {
		    	try{
		    		while(true){
		    			account.deposit((int)(Math.random()*10)+1);
		    			//每次完成一次存款任务都会使该任务暂停1s.
		    			Thread.sleep(1000);
		    		}
		    	}
		    	catch (InterruptedException e) {
					e.printStackTrace();
		    	}
		    }
		  }
		  
		// A thread for subtracting an amount to the account
		  private static class WithdrawTask implements Runnable {
		    public void run() {
		    	while(true){
		    		account.withdraw((int)(Math.random()*10)+1);
		    	}
		    }
		  }
		// An inner class for account
		  private static class Account {
			  //余额
		    private int balance = 0;
		  //Create a lock
		    private static Lock lock = new ReentrantLock();
		    //创建一个 条件
		    private static Condition newDeposit = lock.newCondition();
		    		
		    public int getBalance() {
		      return balance;
		    }
		    //取钱
		    public void withdraw(int withdrawAmount) {
		    	lock.lock();//Acquire the lock
		    	try{
		    		while(balance < withdrawAmount){
		    			System.out.println("\t\t\tWait for a deposit.");
		    			//余额小于取款金额时，等待有新存款的信号
		    			newDeposit.await();
		    		}
		    			balance -= withdrawAmount;
			  	        System.out.println("Withdraw "+withdrawAmount+"\t\t\t\t\t\t"+getBalance());
		  	        
		    	} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        finally{
		        	lock.unlock();//Release the lock
		        }
		    }
		    //存钱
		    public void deposit(int depositAmount) {
		    	lock.lock();//Acquire the lock
		    	try{
		  	        balance += depositAmount;
		  	        System.out.println("Deposit "+depositAmount+"\t\t\t\t\t\t"+getBalance());
		  	        //释放有新存款的信号
		  	      newDeposit.signal();
		    	}
		        finally{
		        	lock.unlock();//Release the lock
		        }
		    }
		  }
}
