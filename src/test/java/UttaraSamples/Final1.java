package UttaraSamples;

public class Final1 {

	public static final Integer[] ARR = {10, 20, 30};
	public final Integer LEN;
	
	public Final1() {
		LEN = ARR.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final1 fobj = new Final1();
		
		ARR[0] = 100;
		System.out.println("Array after modification is:");
		for (Integer i : ARR)
			System.out.println(i);
		
		System.out.println("Final Instance variable value is: " + fobj.LEN);
	}
}
