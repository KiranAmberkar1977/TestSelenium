package UttaraSamples;

public class TestThreads {

	final static int MAX_VAL = 10;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Using the Thread class");
		System.out.println("======================");
		// Leveraging JobThread1 (that extends Thread class) class.
		// Start the child thread execution.
		JobThread1 jb1 = new JobThread1();
		jb1.start();
		
		Thread.sleep(10);
		
		// Start the main Thread execution.
		for (int i = 1; i < MAX_VAL; i++) {
			System.out.println("In Main Thread code. I is : " + i);
		}
	
		System.out.println("\nUsing the Runnable Interface");
		System.out.println("============================");
		// Leveraging JobThread2 (that implements Runnable Interface) class.
		// Start the child thread execution.
		JobThread2 jb2 = new JobThread2();
		Thread t1 = new Thread(jb2);
		t1.setName("MyThread1");
		t1.setPriority(1);
		t1.start();
		t1.join();
		
		Thread t2 = new Thread(jb2);
		t2.setName("MyThread2");
		t2.setPriority(10);
		t2.start();
		t2.join();
		
		// Start the main Thread execution.
		for (int i = 1; i < MAX_VAL; i++) {
			System.out.println("In Main Thread code. I is : " + i);
		}
	}
}
