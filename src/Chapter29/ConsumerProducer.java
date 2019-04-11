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
		    		//�������[1,10]����������
		    		production = (int)(Math.random()*10)+1;
		    		buffer.write(production);
		    		//�߳�������ͣ1s.
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
	    			//�߳�������ͣ0.01s.
					Thread.sleep(10);
		    	}
	    	}
	    	catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	    }
	  }
	//�ڲ���buffer
	  private static class Buffer{
		private static final int CAPACITY = 3;//��������С
		private LinkedList<Integer> queue = new LinkedList<Integer>();
		
		//����һ����
		private static Lock lock = new ReentrantLock();
		//������������
	    private static Condition notEmpty = lock.newCondition();
	    private static Condition notFull = lock.newCondition();
	    
	    public void write(int addInt){
	    	lock.lock();
	    	try{
	    		while(queue.size() == CAPACITY){
		    		System.out.println("Buffer is full.Wait for notFull condition.");
		    		//��������ʱ���ȴ��������������ź�
		    		notFull.await();
		    	}
		    	queue.offer(addInt);
		    	System.out.println("Producer writes "+addInt);
		    	notEmpty.signal();//�ͷų��������ǿյ��ź�
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
		    		//��������ʱ���ȴ��������ǿյ��ź�
		    		notEmpty.await();
		    	}
		    	value = queue.remove();
		    	notFull.signal();//�ͷų��������������ź�
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
