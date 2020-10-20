package UttaraSamples;

public class StringReverse implements Reverser{
	
	public static String res_string = "";
	
	public void revere_string_using_index() {
		char c;
		
		for(int i = src_string.length()-1; i >= 0; i--) {
				c = src_string.charAt(i);
				res_string += c;
		}
	}
	
	public void revere_string_using_XOR( ) {
			// Convert the Immutable Strings to Mutable Char arrays.
			char[] ca1 = src_string.toCharArray();
			char[] ca2 = ca1.clone();
			char c_end;
			
			for(int i =0; i < src_string.length(); i++) {
				char tmp = (char) (ca1[i] ^ ca1[src_string.length() -i - 1]);
				ca2[i] = (char) (ca1[i] ^ tmp);
				ca2[src_string.length() -i - 1] = (char) (ca1[src_string.length() -i - 1] ^ tmp );
				//System.out.println("Index is: " + i + "ca1[ca1.length() -i - 1] is: " + ca1[src_string.length() -i - 1] + "Ca1 is:" + ca1[i] + "and ca1[end] is: " + ca1[ca1.length -i - 1]);
			}
			
			// Convert the char arrays back to Strings(immutable).
			ca1 = ca2.clone();
			res_string = new String(ca1);
	}

	public void reverse_string_using_builder() {
		StringBuilder sb = new StringBuilder(src_string);
		res_string = sb.reverse().toString();
	}	
		
	public static void main(String[] args) {
		Reverser srobj = new StringReverse();
		//srobj.reverse_string_using_builder();
		//srobj.revere_string_using_index();
		srobj.revere_string_using_XOR();
		
		System.out.println("Resulting string is: " + res_string);
	}
}
