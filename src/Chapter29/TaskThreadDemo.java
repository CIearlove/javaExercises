package Chapter29;

public class TaskThreadDemo {

	public static void main(String[] args) {
		//Create tasks
		Runnable printA = new PrintChar('a',10);
		Runnable printB = new PrintChar('b',10);
		Runnable print100 = new PrintNum(10);
		
		//Create threads
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		//Start threads
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
	//The task for printing a charater a specified number of times
	class PrintChar implements Runnable{
		private char charToPrint;
		private int times;
		
		/*
		 * Construct a task with specified character and number of times to print the character
		 */
		public PrintChar(char c,int t){
			charToPrint = c;
			times = t;
		}
		/*
		 * Override the run() method to tell the system what task to perform
		 * @see java.lang.Runnable#run()
		 */
		public void run() {
				for(int i=0;i<times;i++){
					System.out.print(" "+charToPrint);
					//Thread.sleep(1000);
				}
		}
	}
	/*
	 * The task class for printing numbers from 1 to n for a given n
	 */
	class PrintNum implements Runnable{
		private int lastNum;
		
		public PrintNum(int n){
			lastNum = n;
		}

		/*
		 * Tell the thread how to run
		 * @see java.lang.Runnable#run()
		 */
		public void run() {
			//Thread thread = new Thread(new PrintChar('c',5));
			//thread.start();
			
			for(int i=0;i<lastNum;i++){
				System.out.print(" "+i);
			}
		}
	}

