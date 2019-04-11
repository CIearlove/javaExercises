package Chapter29;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumerProducer {
	
	private static Buffer buffer = new Buffer();
	
	// A task for adding an int to the buffer
	  private static class ProducerTask implements Runnable {
	    public void run() {
	    	try{
	    		int production = 0;
		    	while(true){
		    		//随机生产[1,10]的整型数据
		    		production = (int)(Math.random()*10)+1;
		    		buffer.write(production);
		    		//线程运行暂停1s.
					Thread.sleep(1000);
		    	}
	    	}
			catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
    	}
    }
	  
	// A task for reading and deleting an int from the buffer
	  private static class ConsumerTask implements Runnable {
	    public void run() {
	    	try{
	    		while(true){
	    			System.out.println("\t\t\tConsumer reads "+buffer.read());
	    			//线程运行暂停0.01s.
					Thread.sleep(10);
		    	}
	    	}
	    	catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	    }
	  }
	//内部类buffer
	  private static class Buffer{
		private static final int CAPACITY = 3;//缓冲区大小
		private LinkedList<Integer> queue = new LinkedList<Integer>();
		
		//创建一个锁
		private static Lock lock = new ReentrantLock();
		//创建两个条件
	    private static Condition notEmpty = lock.newCondition();
	    private static Condition notFull = lock.newCondition();
	    
	    public void write(int addInt){
	    	lock.lock();
	    	try{
	    		while(queue.size() == CAPACITY){
		    		System.out.println("Buffer is full.Wait for notFull condition.");
		    		//缓冲区满时，等待缓冲区不满的信号
		    		notFull.await();
		    	}
		    	queue.offer(addInt);
		    	System.out.println("Producer writes "+addInt);
		    	notEmpty.signal();//释放出缓冲区非空的信号
	    	}
	    	catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	finally{
	        	lock.unlock();//Release the lock
	        }
	    }
	    
	    public int read(){
	    	lock.lock();
	    	int value = 0;
	    	try{
	    		while(queue.isEmpty()){
		    		
		    		System.out.println("\t\t\tBuffer is empty.Wait for notEmpty condition.");
		    		//缓冲区空时，等待缓冲区非空的信号
		    		notEmpty.await();
		    	}
		    	value = queue.remove();
		    	notFull.signal();//释放出缓冲区不满的信号
	    	}
	    	catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	finally{
	        	lock.unlock();//Release the lock
	        	return value;
	        }
	    	
	    }
	  }
	
	  public static void main(String[] args) {
			
		    ExecutorService executor = Executors.newFixedThreadPool(2);
		    executor.execute(new ProducerTask());
		    executor.execute(new ConsumerTask());
		    executor.shutdown();

		    
		  }
}
