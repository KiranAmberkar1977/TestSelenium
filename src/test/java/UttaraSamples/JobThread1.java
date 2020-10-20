package UttaraSamples;

public class JobThread1 extends Thread{
	static final int MAX_VAL = 10;
	public void run () {
		for (int i = 1; i < MAX_VAL; i++) {
			System.out.println("In Child Thread code. I is : " + i + "and thread name is: " + Thread.currentThread().getName());
		}
	}
}
