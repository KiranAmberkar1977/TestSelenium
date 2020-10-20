package UttaraSamples;

public class TestArray {

	public static void main(String[] args) {
		String[][] sref = new String[3][];
		
		sref[0] = new String[3];
		sref[0][0] = new String("kiran");
		sref[0][1] = "chetan";
		
		sref[1] = new String[3];
		sref[1][0] = new String("kiran2");
		sref[1][1] = "chetan2";
		int iter = 0;
		
		sref[2] = new String[3];
		
		for (String[] s : sref) {
			iter++;
			for (String s2 : s) {
				System.out.println("Array members in iter " + iter + " are: " + s2);
			}
		}
	}
}
