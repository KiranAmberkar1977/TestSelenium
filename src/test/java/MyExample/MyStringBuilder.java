package MyExample;

public class MyStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myIndex; String myInsertableStr = "Oriented "; String myReplacableStr = "Based";
		StringBuffer myStringbuff = new StringBuffer("Object Language");
		
		myIndex = myStringbuff.indexOf("Language");
		
		// Test 1: Insert a substring at specific location in the source string.
		myStringbuff.insert(myIndex, myInsertableStr);
		System.out.println("Initial string is:" + myStringbuff);
		
		System.out.println("Inserted string is:" + myStringbuff);
		
		// Test 2: Replacing section of a string with another string.
		myStringbuff.replace(myIndex, myIndex + myReplacableStr.length(), myReplacableStr);
		myStringbuff.replace(myIndex + myReplacableStr.length(), myIndex + myReplacableStr.length() + (myInsertableStr.length() - myReplacableStr.length()), "   ");
		System.out.println("Replaced string is:" + myStringbuff);
		
		// Test 3: Append a substring at the end of a string.
		myStringbuff.append(" is great...");
		System.out.println("Replaced string is:" + myStringbuff);
	}

}
