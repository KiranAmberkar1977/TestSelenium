package UttaraSamples;

public class JobThread2 implements Runnable{
	static final int MAX_VAL = 100;
	public void run () {
		for (int i = 1; i < MAX_VAL; i++) {
			System.out.println("In Child Thread code. I is : " + i + "and thread name is: " + Thread.currentThread().getName());
//			if (i == 50) {
//				if (Thread.currentThread().getPriority() == 1)
//					Thread.currentThread().setPriority(10);
//				if (Thread.currentThread().getPriority() == 10)
//					Thread.currentThread().setPriority(1);
//			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
