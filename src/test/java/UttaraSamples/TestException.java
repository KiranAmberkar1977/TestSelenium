package UttaraSamples;

public class TestException {

	
	public static int compute(int val1, int val2) {
		int res;
		System.out.println("Performing the divide operation.");
		res = val1 / val2;
		return res;
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int res = 0;
		int [] myArr = new int[4];
		
		try {
			if (args.length == 2) {
				int var1 = Integer.parseInt(args[0]);
				int var2 = Integer.parseInt(args[1]);

				res = TestException.compute(var1, var2);
				
				myArr[4] = 10;
			}
			else {
				System.out.println("Please provide 2 arguments to the program !!");
			}
			System.out.println("Var3 is: " + res);
		}
		catch (Throwable e) {				// Our program won't crash when we define try/catch block. Either mention Exception/Error/Throwable.
			System.out.println("Inside generic catch block...");
			//e.printStackTrace();
			System.out.println("The exception error msg is: " + e.getMessage());
		}
		System.out.println("After printing the var3 output...");	//	This will always be executed.
	}
}
