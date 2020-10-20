package UttaraSamples;

public class CommandLineArgs {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i=0; i < args.length; i++) {
//			String s = args[i];
//			System.out.println("String at position: " + i + " is of value: " + s);
//		}
//		
//		// Using EFL loop
//		for (String s : args) {
//			System.out.println("String value is: " + s);
//		}
//		
//		// Adding all integer arguments(after validating them first !!) Using EFL loop
//		try {
//		Integer totalintval = 0, i;
//		for (String myStr : args) {
//			if ( (i=Integer.parseInt(myStr)) instanceof Integer)
//				totalintval += i;
//		}
//		System.out.println("Total int value is: " + totalintval);
//		}
//		catch(NumberFormatException e) {
//			e.printStackTrace();
//			System.out.println("Exception message is: " + e.getMessage());
//		}
		
		System.out.println("Printing 10 random values...");
		
		for (int i = 0; i < 10; i++) {
			double d = Math.random();
			int result_random_int = (int)(d*1000);
			System.out.println("Random int is: " + result_random_int);
		}	
	}
}
