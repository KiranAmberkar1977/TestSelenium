package MyExample;

public class commonUtility {

	public static boolean isNumberWholenumber(double num) {
		int sec_num = (int)num;
		
		if(sec_num == num)
			return true;
		else
			return false;
		
	}
	
	public static boolean isNumberPerfectsquare (double num2) {
		int i = 0;
		
		if ((int)num2 == 0 || (int)num2 < 0) {
			System.out.println("Number passed should be a positive whole number");
			return false;
		}
		
		for (i = 1; i <= (Math.pow(2.0, 31.0)-1); i++) {
			System.out.println("Inside for loop. i is and num is: " + i + "" + num2);
			if (i*i == (int)num2)
				return true;
			else 
				return false;
		}
		
		return false;
	}
		
	public static boolean isNumberPrime(double num) {
		if (isNumberWholenumber(num))
			System.out.println("Number is a whole num");
		else
			System.out.println("Number is NOT a whole num");

		return false;
	}

}
