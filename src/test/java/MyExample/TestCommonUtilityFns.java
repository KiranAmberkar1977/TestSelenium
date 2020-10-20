package MyExample;

public class TestCommonUtilityFns {

	public static void main(String[] args) {
		boolean res = commonUtility.isNumberPrime(13.33);
		res = commonUtility.isNumberPrime(13.0);
		res = commonUtility.isNumberPerfectsquare(9.0);
		System.out.println("Res is: " + res);
	}
}
