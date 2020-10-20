package UttaraSamples;

import java.math.BigInteger;

public class VarArgs {

	public long add (int...myarg) {
		long sum=0;
		
		if (myarg == null)
			throw new IllegalArgumentException("Arguments can't be null");
		
		for (int i : myarg)
			sum += i;
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		VarArgs obj = new VarArgs();
		
		long result = obj.add(1,2,3,4,5,6);
		System.out.println("Result is: " + result);
	
	}
	
}
