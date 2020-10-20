package UttaraSamples;

import javax.lang.model.util.Elements;

public class TestArray2 {

	public static void print_arr(double[] ref) {
		//  1. Loop over each element and access element.
		for (double fobj : ref) {
			System.out.println("The array member is: " + fobj);
		}
	}
	
	public static double findAverage(double[] ref) {
		//	1. Loop over each element and access element.
		//	2. Add each element value to local variable called sum.
		//	3. Divide sum by the total no. of Elements.
		//  4. Return sum.
		double sum = 0.0;
		for (double dobj : ref) {
			sum += dobj;
		}
		return (sum / ref.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] darr = { 10.0f, 20.0f, 30.0f };
		
		darr[2] = 40.0;
		
		TestArray2.print_arr(darr);
		System.out.println("Average of array is: " + TestArray2.findAverage(darr));
		
		char[] carr = new char[10];
		carr[0] = 'a';
		carr[1] = 1;
		carr[2] = 2;
		carr[3] = 'd';
		carr[4] = (char)(carr[0] + carr[1]);
		carr[5] = (char)(carr[4] + carr[2]);
		System.out.println("Concatenated chars are: " + carr[4] + " and " + carr[5]);
				
	}

}
