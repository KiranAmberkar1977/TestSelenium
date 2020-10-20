package UttaraSamples;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10, num2 = 5;
		// Prints 15After since Left to Right processing says it should treat variables as integers.
		System.out.println(num1 + num2 + "After");
		
		// Prints Before105After since Left to Right processing says it should treat variables as Strings.
		System.out.println("Before" + num1 + num2 + "After");
		
		// Prints Before15After since Left to Right processing uses BODMAS rule.
		System.out.println("Before" + (num1 + num2) + "After");
		
		// Relational operators. Below returns true and false.
		System.out.println("Result is:" + ((123==124) || (23==23)) );
		System.out.println("Result is:" + ((123==124) && (23==23)) );
	}
}
