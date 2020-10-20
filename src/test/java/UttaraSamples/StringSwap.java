package UttaraSamples;

public class StringSwap {
	String str_src = "Kirana Amberkar", str_dst = "Chetan Malonkar";
	String str_src_digits = "123", str_dst_digits = "456";
			
	public void swap_using_refs() {
		String tmp = str_src;
		str_src = str_dst;
		str_dst = tmp;
	}
	
	public String getStr_src() {
		return str_src;
	}

	public String getStr_dst() {
		return str_dst;
	}

	public void swap_strdigits_using_XOR( ) {
		int int_res = Integer.valueOf(str_src_digits) ^ Integer.valueOf(str_dst_digits);
		
		str_src_digits = String.valueOf(int_res ^ Integer.valueOf(str_src_digits));
		str_dst_digits = String.valueOf(int_res ^ Integer.valueOf(str_dst_digits));
		
		str_src = str_src_digits;
		str_dst = str_dst_digits;
		
	}
	
	// Serious limitation w/ this approach is that the String sizes need to be the SAME always.
	public void swap_str_using_XOR( ) {
		// Convert the Immutable Strings to Mutable Char arrays.
		char[] ca1 = str_src.toCharArray();
		char[] ca2 = str_dst.toCharArray();
				
		for(int i =0; i < ca1.length; i++) {
			ca1[i] = (char) (ca1[i] ^ ca2[i]);
			ca2[i] = (char) (ca1[i] ^ ca2[i]);
			ca1[i] = (char) (ca1[i] ^ ca2[i]);
		}
		
		// Convert the char arrays back to Strings(immutable).
		str_src = new String(ca1);
		str_dst = new String(ca2);
	}
		
	public void swap_using_concatenation() {
		str_src += str_dst;
		int dst_len = str_dst.length();
		
		
		str_dst = str_src.substring(0, str_src.length() - str_dst.length());
		str_src = str_src.substring(str_src.length() - dst_len, str_src.length());

	}
	
	public static void main(String[] args) {
		
		StringSwap sobj = new StringSwap();
		//sobj.swap_using_refs();
		//sobj.swap_using_concatenation();
		//sobj.swap_strdigits_using_XOR();
		sobj.swap_str_using_XOR();
		
		System.out.println("Strings after swapping are: str_src: " + sobj.getStr_src() + " and str_dst: " + sobj.getStr_dst());

	}

}
