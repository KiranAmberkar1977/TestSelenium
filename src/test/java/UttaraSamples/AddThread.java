package UttaraSamples;

public class AddThread extends Thread{
	int[] arr;
	long result;
	
	public AddThread(int[] a) {
		this.arr = a;
	}

	public void run( ) {
		long sum = 0;
				
		for(int val : arr)
			sum += val;
			
		result = sum;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11, 12, 13, 14, 15};
		AddThread t1 = new AddThread(arr);
		
		t1.start();
		t1.join(); // Means 'join to the end of t1'. Means wait till t1 completes execution OR throws an Exception.
		
		System.out.println("T1 result is: " + t1.result);
	}
}
